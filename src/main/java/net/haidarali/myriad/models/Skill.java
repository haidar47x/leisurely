package net.haidarali.myriad.models;

import java.util.Objects;

public class Skill {

    private String skillId;
    private String name;
    /** A skill can have many tasks. **/
    /** private ArrayList<Task> tasks; **/

    public Skill(String name) {
        this.name = name;
    }

    public String getSkillId() {
        return skillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return Objects.equals(skillId, skill.skillId) && Objects.equals(name, skill.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId, name);
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skillId='" + skillId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
