package com.cg.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.product.dto.Product;
import com.cg.product.service.ProductService;



@Controller
public class ProductController {

	@Autowired
	ProductService service;
	
	@RequestMapping(value="/display",method=RequestMethod.GET)
	public ModelAndView displayAll()
	{
		List<Product> list = service.showAll();
		return new ModelAndView("show","pros",list);
	}
	
	
	
	@RequestMapping(value="/addproduct",method=RequestMethod.POST)
	public String adding(@ModelAttribute("pro")Product pro,BindingResult result)
	{
		service.addProduct(pro);
		
		
		return "redirect:/display";
	}
	
@RequestMapping(value="/updateproduct",method=RequestMethod.POST)
	public String updating(@ModelAttribute("pro")Product pro,BindingResult result)
	{
		
		service.updateProduct(pro);
		return "redirect:/display";
	}
	
	@RequestMapping(value="/deleteproduct",method=RequestMethod.POST)
	public String deleting(@ModelAttribute("pro")Product pro,BindingResult result)
	{
		int id = pro.getId();
		service.deleteProduct(id);
		return "redirect:/display";
	}
	

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String myEmployee(@ModelAttribute("pro") Product pro) {
		
		
		return "add_product";
	}
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String myEmployee1(@ModelAttribute("pro") Product pro) {
		
		
		return "updateid";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String myEmployee2(@ModelAttribute("pro") Product pro) {
		
		
		return "delete_product";
	}
/*	@RequestMapping(value="/update1",method=RequestMethod.GET)
	public String myEmployee3(@ModelAttribute("pro") Product pro) {
		
		
		return "update_product";
	}*/
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public String findEmployee(@ModelAttribute("pro") Product pro,BindingResult result)
	{
		int id = pro.getId();
		service.searchProduct(id);
		return "update_product";
		
	}
}
