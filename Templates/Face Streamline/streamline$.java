import java.swing.*;
import java.bufferIO.*;

  public static void main(String[] args) {
  // TODO: Main stream code here, copy this template, do NOT move it!
  
  from MainUI.c {
  Swing.useUI; // The UI from the MainUI.c file, will run this code and place anything here on top.
  BufferIO new BufferIO = buffer$1;
  buffer$1.setSize(6, 0);
  buffer$1.setPriority(0);
  buffer$1.mainFile(buffer$1, 1, 1);
  }
}
