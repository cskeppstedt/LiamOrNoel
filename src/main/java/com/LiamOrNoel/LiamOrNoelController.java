/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LiamOrNoel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author jonatan
 */
@Controller
@RequestMapping("/liam-or-noel")
public class LiamOrNoelController {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody ImageObject liamOrNoel() {
        return new ImageObject(0, "http://pixel.nymag.com/imgs/daily/vulture/2015/02/19/19-noel-gallagher-chatroom-silo.w245.h368.png", "Noel");
    }
}
