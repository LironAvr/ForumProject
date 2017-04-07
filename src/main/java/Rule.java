/**
 * Created by lirona on 07/04/2017
 **/
public class Rule {

    public enum ruleType {
        Users, Moderators
    }

    private ruleType type;
    private String rule;

    public Rule(ruleType type, String rule){
        this.type = type;
        this.rule = rule;
    }
}
