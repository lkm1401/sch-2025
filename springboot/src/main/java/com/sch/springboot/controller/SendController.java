package com.sch.springboot.controller;

import com.sch.springboot.domain.SendDomain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SendController {

    @ResponseBody
    @PostMapping("/sendCheck")
    public SendDomain sendCheck(SendDomain sendDomain) {
//        model.addAttribute("name", name);
//        model.addAttribute("address", address);
//        return model.toString();
//        SendDomain sendDomain = new SendDomain();
//        sendDomain.setName(name);
//        sendDomain.setAddress(address);
        System.out.println(sendDomain.getAge());
        return sendDomain;
    }

    @ResponseBody
    @GetMapping("/sendCheck")
    public SendDomain sendCheck(@RequestParam("name") String name, @RequestParam("address") String address) {
//        model.addAttribute("name", name);
//        model.addAttribute("address", address);
//        return model.toString();
        SendDomain sendDomain = new SendDomain();
        sendDomain.setName(name);
        sendDomain.setAddress(address);
        return sendDomain;
    }
}
