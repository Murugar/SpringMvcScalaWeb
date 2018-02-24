package com.iqmsoft.spring.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class HelloWorldController {

  @RequestMapping(Array("/hellopage.html"))
  def showHello = "helloPage"

}
