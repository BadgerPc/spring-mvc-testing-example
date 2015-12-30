package example.spring.common.controller;

import com.google.gson.JsonObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ListController
{
    @RequestMapping(path="/getList", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
	protected ResponseEntity<JsonObject> retrieveList()
    {
        JsonObject o = new JsonObject();
        o.addProperty("key1", "value1");
        o.addProperty("key2", "value2");
        return new ResponseEntity<JsonObject>(o, HttpStatus.OK);
	}

}