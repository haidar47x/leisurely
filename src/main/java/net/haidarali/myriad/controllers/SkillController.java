package net.haidarali.myriad.controllers;

import net.haidarali.myriad.models.Skill;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class SkillController {

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @PostMapping("/skill")
    public ResponseEntity<Skill> createSkill(@RequestBody Skill skill) {
        logger.info(skill.toString());
        return ResponseEntity.ok().body(skill);
    }
}
