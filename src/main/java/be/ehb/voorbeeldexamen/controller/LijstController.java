package be.ehb.voorbeeldexamen.controller;

import be.ehb.voorbeeldexamen.voorbeeldexamen.Lijst;
import be.ehb.voorbeeldexamen.voorbeeldexamen.LijstDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LijstController {
    @Autowired
    LijstDAO dao;

    @RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Lijst getAllItem(@PathVariable(value = "id") Integer id) {
        return dao.findById(id).get();
    }


    @RequestMapping(value = "/item/all", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Lijst> getAllLijst() {
        return dao.findAll();
    }


@RequestMapping(value ="/item/{categorie}",method = RequestMethod.POST)
@ResponseBody
    public List<Lijst>getByName(@PathVariable(value = "categorie")String categorie){
return dao.findByCategorie(categorie);

}



}
