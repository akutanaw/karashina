import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
/**
 * クリップボードから文字列データを出力します。
 */
public class PrintClipboardString {
    /**
     * メイン
     */
    public static void main(String[] args) {
        System.out.println(getClipboardString());
    }
    /**
     * クリップボードから文字列データを返します。
     * 
     * @return クリップボードの文字列データを返します。文字列データでない場合はnullを返します。
     */
    public static String getClipboardString() {
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();

        try {
            return (String) clip.getData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException e) {
            return null;
        } catch (IOException e) {
            return null;
        }
    }
}