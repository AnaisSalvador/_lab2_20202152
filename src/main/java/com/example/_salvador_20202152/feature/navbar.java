package com.example._salvador_20202152.feature;
import com.example._salvador_20202152.entity.persona;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/feature/navbar")
public class navbar {
    @GetMapping(value=" ")
    public String vuelos(){
        return "/feature/navbar/vuelo";
    }

    @GetMapping("/buscar")
    public String buscar(@RequestParam(name = "vuelo", required = false) String vue,
                         @RequestParam(name = "paquete", required = false) String paquete){
        System.out.println("vuelo: " + vue);
        System.out.println("paquete:" + paquete);
        return "feature/vuelos";
    }
}
