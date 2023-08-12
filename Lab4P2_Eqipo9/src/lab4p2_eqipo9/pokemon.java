
package lab4p2_eqipo9;


public class pokemon {
    
    private String especie;
    private int nivel;
    private int puntos_xp;
    private int xp_necesaria;
    private int[] movimiento = new int[4];
    private int hp;
    private int atk;
    private int def;
    private int sp;
    private int spe;
    private String estado;

    public pokemon() {
    }

    public pokemon(String especie, int nivel, int puntos_xp, int xp_necesaria, int hp, int atk, int def, int sp, int spe, String estado) {
        this.especie = especie;
        this.nivel = nivel;
        this.puntos_xp = puntos_xp;
        this.xp_necesaria = xp_necesaria;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.sp = sp;
        this.spe = spe;
        this.estado = estado;
    }

    public int getXp_necesaria() {
        return xp_necesaria;
    }

    public void setXp_necesaria(int xp_necesaria) {
        this.xp_necesaria = xp_necesaria;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntos_xp() {
        return puntos_xp;
    }

    public void setPuntos_xp(int puntos_xp) {
        this.puntos_xp = puntos_xp;
    }

    public int[] getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(int[] movimiento) {
        this.movimiento = movimiento;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public int getSpe() {
        return spe;
    }

    public void setSpe(int spe) {
        this.spe = spe;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "pokemon{" + "especie=" + especie + ", nivel=" + nivel + ", puntos_xp=" + puntos_xp + ", movimiento=" + movimiento + ", hp=" + hp + ", atk=" + atk + ", def=" + def + ", sp=" + sp + ", spe=" + spe + ", estado=" + estado + '}';
    }
}
