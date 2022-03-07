import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuilder strCreate = new StringBuilder();

        File dirSrc = new File("D://Games/src");
        if (dirSrc.mkdir()) {
            strCreate.append("В катологе D://Games создан каталог src \r\n");
        } else {
            strCreate.append("При создании каталога src произошла ошибка \r\n");
        }

        File dirRes = new File("D://Games/res");
        if (dirRes.mkdir()) {
            strCreate.append("В катологе D://Games создан каталог res \r\n");
        } else {
            strCreate.append("При создании каталога res произошла ошибка \r\n");
        }

        File dirSaveGames = new File("D://Games/savegames");
        if (dirSaveGames.mkdir()) {
            strCreate.append("В катологе D://Games создан каталог savegames \r\n");
        } else {
            strCreate.append("При создании каталога savegames произошла ошибка \r\n");
        }

        File dirTemp = new File("D://Games/temp");
        if (dirTemp.mkdir()) {
            strCreate.append("В катологе D://Games создан каталог temp \r\n");
        } else {
            strCreate.append("При создании каталога temp произошла ошибка \r\n");
        }

        File dirMain = new File(dirSrc, "main");
        if (dirMain.mkdir()) {
            strCreate.append("В катологе Src создан каталог main \r\n");
        } else {
            strCreate.append("При создании каталога main произошла ошибка \r\n");
        }

        File dirTest = new File(dirSrc, "test");
        if (dirTest.mkdir()) {
            strCreate.append("В катологе Src создан каталог test \r\n");
        } else {
            strCreate.append("При создании каталога test произошла ошибка \r\n");
        }

        File fileMain = new File(dirMain, "Main.java");
        try {
            if (fileMain.createNewFile())
                strCreate.append("В подкаталоге main был создан файл Main.java \r\n");
        }
        catch (IOException ex) {
            strCreate.append("При создании файла Main.java произошла ошибка: ");
            strCreate.append(ex.getMessage());
            strCreate.append("\r\n");
        }

        File fileUtils = new File(dirMain, "Utils.java");
        try {
            if (fileUtils.createNewFile())
                strCreate.append("В подкаталоге main был создан файл Utils.java \r\n");
        }
        catch (IOException ex) {
            strCreate.append("При создании файла Utils.java произошла ошибка: ");
            strCreate.append(ex.getMessage());
            strCreate.append("\r\n");
        }

        File dirDrawables = new File(dirRes, "drawables");
        if (dirDrawables.mkdir()) {
            strCreate.append("В катологе Res создан каталог drawables \r\n");
        } else {
            strCreate.append("При создании каталога drawables произошла ошибка \r\n");
        }

        File dirVectors = new File(dirRes, "vectors");
        if (dirVectors.mkdir()) {
            strCreate.append("В катологе Res создан каталог vectors \r\n");
        } else {
            strCreate.append("При создании каталога vectors произошла ошибка \r\n");
        }

        File dirIcons = new File(dirRes, "icons");
        if (dirIcons.mkdir()) {
            strCreate.append("В катологе Res создан каталог icons \r\n");
        } else {
            strCreate.append("При создании каталога icons произошла ошибка \r\n");
        }

        File fileTemp = new File(dirTemp, "Temp.txt");
        try {
            if (fileTemp.createNewFile())
                strCreate.append("В подкаталоге temp был создан файл Temp.txt \r\n");
        }
        catch (IOException ex) {
            strCreate.append("При создании файла Temp.txt произошла ошибка: ");
            strCreate.append(ex.getMessage());
        }
        String text = strCreate.toString();
        try (FileWriter writer = new FileWriter(fileTemp, false)) {
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
