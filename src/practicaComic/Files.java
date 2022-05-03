package practicaComic;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Files {

    String path;

    public Files(String path){
        this.path = path;
    }

    private String[] getFiles(){
        File directory = new File(path);

        FilenameFilter filenameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.endsWith(".jpg")){
                    return true;
                }else
                    return false;
            }
        };

        String []list = directory.list(filenameFilter);

        char [] chars;
        StringBuilder nums;
        int [] intFiles = new int[list.length];


        for(int i = 0; i< list.length; i++) {
            nums = new StringBuilder();
           chars = list[i].toCharArray();
           for(char c : chars){
               if (Character.isDigit(c)){
                   nums.append(c);
               }
           }
           intFiles[i] = Integer.parseInt(nums.toString());
        }


        for (int i = 0; i < list.length-1; i++) {
            for (int j = i+1; j < list.length; j++) {
                if (intFiles[i] > intFiles[j]){
                    int numTemp = intFiles[i];
                    intFiles[i] = intFiles[j];
                    intFiles[j] = numTemp;

                    String temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;

                }
            }
        }

        return list;
    }

    private String[] getText() throws IOException {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\adria\\IdeaProjects\\BackendJava\\img\\comic\\dialogos.txt"));

        String text = null;
        String txt = "";

        while ((text = br.readLine()) != null) {
            txt += text + "\n";
        }

        String[] dialogs = txt.split("\n");

        br.close();
        return dialogs;
    }

    public Pagina[] getPages() throws IOException {
        String[] nameImages = getFiles();
        String[] dialogs = getText();


        Pagina[] paginas = new Pagina[nameImages.length];
        for(int i = 0; i< nameImages.length; i++){
            paginas[i] = new Pagina(path+nameImages[i], dialogs[i]);

        }
        return paginas;
    }
}
