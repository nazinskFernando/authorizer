package com.example.authorizer.controllers;

import com.example.authorizer.domains.Authorizer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/authorizers")
public class AuthorizersController {
    private Authorizer authorizer;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Authorizer> postAuthorizer(@RequestBody Authorizer authorizer){
        this.authorizer = authorizer;
        return ResponseEntity.ok(this.authorizer);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Authorizer> getAuthorizer(){
        return ResponseEntity.ok(this.authorizer);
    }

}
