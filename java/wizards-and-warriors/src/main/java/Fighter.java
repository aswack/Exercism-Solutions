abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }
    
    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        if (wizard.isVulnerable()){
            return 10;
        }else return 6;
    }
}

class Wizard extends Fighter {
    private boolean spellDone;
    
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
    
    @Override
    boolean isVulnerable() {
        return !spellDone;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if (spellDone) return 12;
        else return 3;
    }

    void prepareSpell() {
        spellDone = true;
    }
}