package practicaComic;

public class Pagina {

    private String path;
    private String description;

    public Pagina(String path, String description){
        this.path = path;
        this.description = description;
    }

    public Pagina(String path){
        this.path = path;
    }

    public String getPath() {
        return path;
    }
    public String getDescription(){
        return description;
    }

    public boolean setPath(String path){
        if(!path.isEmpty()){
            this.path = path;
            return true;
        }else
            return false;
    }

    public boolean setDescription(String description){
        if(!description.isEmpty()){
            this.description = description;
            return true;
        }else
            return false;
    }
}
