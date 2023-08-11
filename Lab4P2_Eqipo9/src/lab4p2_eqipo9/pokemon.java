/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_eqipo9;


public class pokemon {
    
    private String especie;
    private int nivel;
    private int puntos_xp;
    private int[] movement = new int[4];
    private int hp;
    private int atk;
    private int def;
    private int esp;
    private int vel;
    private String estado;

    public pokemon() {
    }

    public pokemon(String especie, int nivel, int puntos_xp, int hp, int atk, int def, int esp, int vel, String estado) {
        this.especie = especie;
        this.nivel = nivel;
        this.puntos_xp = puntos_xp;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.esp = esp;
        this.vel = vel;
        this.estado = estado;
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

    public int[] getMovement() {
        return movement;
    }

    public void setMovement(int[] movement) {
        this.movement = movement;
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

    public int getEsp() {
        return esp;
    }

    public void setEsp(int esp) {
        this.esp = esp;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "pokemon{" + "especie=" + especie + ", nivel=" + nivel + ", puntos_xp=" + puntos_xp + ", movement=" + movement + ", hp=" + hp + ", atk=" + atk + ", def=" + def + ", esp=" + esp + ", vel=" + vel + ", estado=" + estado + '}';
    }
}
