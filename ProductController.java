package com.sb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sb.Entity.Product1;
import com.sb.exception.ResourceNotFoundException;
import com.sb.repository.ProductRepository;
import com.sb.service.Productservice;

@RestController
/*@RequestMapping("/proApi")*/
public class ProductController {
	@GetMapping("/")
	public String hello() {
		
		return "Hello Controller";
	}

}

	/*@Autowired
	ProductRepository pr;
	@Autowired
	Productservice ps;
	private CrudRepository<Product1, Integer> productRepository;
	
	
	@PostMapping("/create")
//	private int cl(@RequestBody Product1 pr1){
//		ps.m1(pr1);
//		return pr1.getId();
//	}
	
	public ResponseEntity<Product1> createProduct(@Valid @RequestBody Product1 product) {
		try{
			Product1 prod1 = ps.saveOrUpdateProd(product);
			return new ResponseEntity<>(prod1, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
		
	    @GetMapping("/readAll")
		public ResponseEntity<List<Product1>> getAllProducts(@RequestParam(required=false) String name) {
			try {
				List<Product1> product=new ArrayList<Product1>();

				if (name==null)
					pr.findAll().forEach(product::add);
				else
					pr.findByNameContaining(name).forEach(product::add);

				if (product.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}

				return new ResponseEntity<>(product, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	
	    @GetMapping("/product/{id}")
	    public ResponseEntity < Product1 > getProductById
	    (@PathVariable(value = "id") int productId)
	    throws ResourceNotFoundException {
	    	Product1 prod = pr.findById(productId)
	            .orElseThrow(() -> new ResourceNotFoundException("Your Entered Employee Number is not available in Database,Could you please try with other Emp Number :: " + productId));
	        return ResponseEntity.ok().body(prod);
	    }

//     @GetMapping("/read")
//     private List<Product1> rl(){
//    	 return ps.m2();
//}
//     private Product1 ul(@RequestBody Product1 pr2){
//    	 ps.m1(pr2);
//    	 return pr2;
    	 
    	 
  //   }
     @DeleteMapping("/delete/{id}")
     private void deleteProduct1(@PathVariable("id") int id) 
     {
    	 ps.m4(id);
     }
     @PutMapping("/update")  
     private Product1 update(@RequestBody Product1 suresh)   
     {  
     	ps.m1(suresh);
     	return suresh;
     }
     
}


*/