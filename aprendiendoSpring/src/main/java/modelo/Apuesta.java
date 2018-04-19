package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="tabla_apuestas")
public class Apuesta {
private String nombre;
private String campo1;
private String campo2;
private String campo3;
private String campo4;
private String campo5;
private String campo6;
private String campo7;
private String campo8;
private String campo9;
private String campo10;
@Id
@GeneratedValue
private int id;

public Apuesta() {
	// TODO Auto-generated constructor stub
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getCampo1() {
	return campo1;
}

public void setCampo1(String campo1) {
	this.campo1 = campo1;
}

public String getCampo2() {
	return campo2;
}

public void setCampo2(String campo2) {
	this.campo2 = campo2;
}

public String getCampo3() {
	return campo3;
}

public void setCampo3(String campo3) {
	this.campo3 = campo3;
}

public String getCampo4() {
	return campo4;
}

public void setCampo4(String campo4) {
	this.campo4 = campo4;
}

public String getCampo5() {
	return campo5;
}

public void setCampo5(String campo5) {
	this.campo5 = campo5;
}

public String getCampo6() {
	return campo6;
}

public void setCampo6(String campo6) {
	this.campo6 = campo6;
}

public String getCampo7() {
	return campo7;
}

public void setCampo7(String campo7) {
	this.campo7 = campo7;
}

public String getCampo8() {
	return campo8;
}

public void setCampo8(String campo8) {
	this.campo8 = campo8;
}

public String getCampo9() {
	return campo9;
}

public void setCampo9(String campo9) {
	this.campo9 = campo9;
}

public String getCampo10() {
	return campo10;
}

public void setCampo10(String campo10) {
	this.campo10 = campo10;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

}
