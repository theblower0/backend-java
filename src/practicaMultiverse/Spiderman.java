package practicaMultiverse;

public class Spiderman {

    private String nombre;
    private String alias;
    private String genero;
    private String universo;
    private String lugarNacimiento;
    private String raza;

    public Spiderman(String nombre, String alias, String genero, String universo, String lugarNacimiento, String raza){
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.universo = universo;
        this.lugarNacimiento = lugarNacimiento;
        this.raza = raza;
    }

    public String getNombre(){  return nombre;  }
    public String getGenero(){  return genero;  }
    public String getAlias(){  return alias;  }
    public String getUniverso(){  return universo;  }
    public String getLugarNacimiento(){  return lugarNacimiento;  }
    public String getRaza(){  return raza;  }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setAlias(String alias){
        if(!alias.isEmpty()){
            this.alias = alias;
            return true;
        }else
            return false;
    }
    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }
    public boolean setUniverso(String universo){
        if(!universo.isEmpty()){
            this.universo = universo;
            return true;
        }else
            return false;
    }
    public boolean setLugarNacimiento(String lugarNacimiento){
        if(!lugarNacimiento.isEmpty()){
            this.lugarNacimiento = lugarNacimiento;
            return true;
        }else
            return false;
    }

    public boolean setRaza(String raza){
        if(!raza.isEmpty()){
            this.raza = raza;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                "\nNombre: "+nombre+
                        "\nAlias: "+alias+
                        "\nGénero: "+genero+
                        "\nUniverso: "+universo+
                        "\nLugar de Nacimiento: "+lugarNacimiento+
                        "\nRaza: "+raza+"\n";
    }
}
