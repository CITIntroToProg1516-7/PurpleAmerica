package map;

import java.io.File;

/**
 *
 * @author Rob
 */
class FileList {

    int i = -1;
    String[] fileNames = new String[1000];

    public String[] fileList(final File folder) {
        for (final File fileEntry : folder.listFiles()) {

            if (fileEntry.isDirectory()) {
                fileList(fileEntry);
            } else {
                i++;
                fileNames[i] = fileEntry.getName();
            }
        }
        return fileNames;
    }
}
