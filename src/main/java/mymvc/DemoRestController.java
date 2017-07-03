package mymvc;

import domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by menghu on 2017/7/3.
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getJson", produces = {"application/json;charset=utf-8"})
    public DemoObj getJson(DemoObj obj){
        return new DemoObj(obj.getId()+1,obj.getName()+"yy");
    }

    @RequestMapping(value = "/getXml", produces = {"application/xml;charset=utf-8"})
    public DemoObj getXml(DemoObj obj){
        return new DemoObj(obj.getId()+1,obj.getName()+"yyxml");
    }
}
