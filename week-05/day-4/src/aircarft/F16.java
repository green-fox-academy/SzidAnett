package aircarft;

public class F16 extends Aircraft{

    public F16(){
        super();
        this.maxAmmo=8;
        this.baseDamage=30;
        this.type="F16";
    }

    @Override
    boolean isPriority() {
        return false;
    }
}
