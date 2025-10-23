package com.subhash.devfolio.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.subhash.devfolio.entity.Message;
import com.subhash.devfolio.service.interfaces.MessageService;

import java.util.List;

@Controller
@RequestMapping("/admin/messages")
public class MessageAdminController {
    private MessageService messageService;

    @Autowired
    public MessageAdminController(MessageService messageService) {
        this.messageService = messageService;
    }

    //Mapping for listing the education
    @GetMapping({"","/","/list"})
    public String listEducations(Model theModel){
        List<Message> theMessages = messageService.getAllMessages();

        theModel.addAttribute("messageList", theMessages);

        return "admin/messages/list-messages";
    }

    @GetMapping("/delete")
    public String deleteEducation(@RequestParam("messageId") int messageId){
        messageService.deleteById(messageId);

        return "redirect:/admin/messages";
    }
}