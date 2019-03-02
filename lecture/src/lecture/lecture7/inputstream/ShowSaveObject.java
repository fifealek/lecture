package lecture.lecture7.inputstream;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ShowSaveObject {

    protected void saveObject(final Serializable object, final String nameFile) {
        java.io.ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(nameFile));
            objectOutputStream.writeObject(object);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null) {
                close(objectOutputStream);
            }
        }

    }

    protected Object loadObject(final String nameFile) {
        java.io.ObjectInputStream objectInputStream = null;
        Object object =null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(nameFile));
            object = objectInputStream.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream != null) {
                close(objectInputStream);
            }
        }

        return object;
    }


    private void close(Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Serializable createObject() {

        Country country = new Country("Ukraine");
        ClientData clientData = new ClientData(1, "Alex", "Cf", 28, country);
        return clientData;
    }

    public static void main(String... args) {
        final String nameFile = "data";
        ShowSaveObject showSaveObject = new ShowSaveObject();
        showSaveObject.saveObject(showSaveObject.createObject(),nameFile);
        Object o = showSaveObject.loadObject(nameFile);

        if(o.getClass()==ClientData.class) {
            ClientData clientData = (ClientData)o;
            System.out.println(clientData);
        }

        if(o instanceof ClientData) {
            ClientData clientData = (ClientData)o;
            System.out.println(clientData);
        }

    }
}
