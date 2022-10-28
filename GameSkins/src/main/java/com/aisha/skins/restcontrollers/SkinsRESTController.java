package com.aisha.skins.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aisha.skins.entities.Skins;
import com.aisha.skins.service.SkinService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class SkinsRESTController {
@Autowired
SkinService skinService;
@RequestMapping(method = RequestMethod.GET)
public List<Skins> getAllSkins() {
return skinService.getAllSkins();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Skins getSkinById(@PathVariable("id") Long id) {
return skinService.getSkin(id);
 }
@RequestMapping(method = RequestMethod.POST)
public Skins createSkin(@RequestBody Skins Skins) {
return skinService.saveSkin(Skins);
}
@RequestMapping(method = RequestMethod.PUT)
public Skins updateSkin(@RequestBody Skins Skins) {
return skinService.updateSkin(Skins);
}
@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deleteSkin(@PathVariable("id") Long id)
{
	skinService.deleteSkinById(id);
}
@RequestMapping(value="/skinstype/{idType}",method = RequestMethod.GET)
public List<Skins> getSkinsByTypeId(@PathVariable("idType") Long idType) {
return skinService.findByTypeIdType(idType);
}
}
