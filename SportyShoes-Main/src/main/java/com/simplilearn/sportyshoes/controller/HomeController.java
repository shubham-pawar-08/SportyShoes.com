package com.simplilearn.sportyshoes.controller;


import com.simplilearn.sportyshoes.models.Products;
import com.simplilearn.sportyshoes.models.Users;
import com.simplilearn.sportyshoes.service.ProductService;
import com.simplilearn.sportyshoes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HomeController {
    @Autowired
    ProductService productService;
    @Autowired
    UserService userService;

    public int userId;
    
    
    // returns index.html------------------------------------------------DONE
    @GetMapping("/")
    public String showHomePage(){
        return "index";
    }
 
    
    //Returns index.html ---------------------------------------------------DONE
    @GetMapping("/logout")
    public String showLogoutPage(){
        return "index";
    }
    
    //Returns login.html-----------------------------------------------------DONE
    @GetMapping("/login")
    public String showLoginPage(){
        return "login";
    }
    
    //Returns 
    //1)adminHome.html--if password is "admin"        -------------
    //2)shop.html--if its a normal user   -----------------------------------DONE
    
    @PostMapping("/login")
    public String validateLoginDetails(@RequestParam("email")String email,@RequestParam("password") String password){

        Users user = userService.getUserDetailByEmail(email);
        if(user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password)){
            userId=user.getId();
            if(password.equals("admin"))
                return "adminHome";
            return "redirect:/shop";
        }
        else 
        {
            return "login";
        }
    }
    
    
    //Returns register.html -------------------------------------------DONE
    @GetMapping("/register")
    public ModelAndView showRegisterPage(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("user",new Users());
        mv.setViewName("register");
        return mv;

    }

    
    //Returns login.html -----------------------------------------------DONE
    @PostMapping("/register")
    public String showLogin(@ModelAttribute("user")Users user){
        userService.saveUser(user);
        return "login";
    }
    
    
    
    //returns shop.html-------------------------------------DONE
    @GetMapping("/shop")
    public ModelAndView getShopPage(){

        ModelAndView mv = new ModelAndView();

        mv.addObject("products",productService.getAllProducts());
        mv.setViewName("shop");

        return mv;


    }

    
    //returns shop.html--------------------------------------------------DONE
    @GetMapping("/shop/highToLow")
    public ModelAndView sortLowToHigh(){

        ModelAndView mv = new ModelAndView();
        mv.addObject("products",productService.getSortedHighToLow());
        mv.setViewName("shop");
        return mv;
    }

    
    //returns shop.html-------------------------------------DONE
    @GetMapping("/shop/lowToHigh")
    public ModelAndView sortHighToLow(){

        ModelAndView mv = new ModelAndView();

        mv.addObject("products",productService.getSortedLowToHigh());
        mv.setViewName("shop");
        return mv;
    }
}
