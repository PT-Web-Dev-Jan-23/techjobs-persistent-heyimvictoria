package org.launchcode.techjobs.persistent.controllers;

import org.launchcode.techjobs.persistent.models.Skill;
import org.launchcode.techjobs.persistent.models.data.SkillRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("skills")
public class SkillController {
    private SkillRepository skillRepository;
    @GetMapping
    public String displayAllSkills(Model model){
        model.addAttribute("skills", "All Skills");
        model.addAttribute("skills", skillRepository.findAll());
        return "skills/index";
    }
    @GetMapping("add")
    public String displayAddSkillForm(Model model)
    {
        model.addAttribute(new Skill());
        return "skills/add";
    }
    @PostMapping()
    public String processAddSkillForm(){
        return "redirect:";
    }

    @GetMapping("view")
    public String displayViewSkill(){
        return "redirect:.../";
    }
}
