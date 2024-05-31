/*
            ****************************                                          *****************************

!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!        هر جا تو کد  به مشکل خوردی  صفحه رو بزرگ-کوچیک کنی درست میشه     !!!!!!!!! !!!!!!!!!!!!!!!

             **************************                                            *******************************
*/

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
public class ImageViewer extends JFrame implements ActionListener{
    JButton selectFileButton;
    JButton showImageButton;
    JButton resizeButton;
    JButton grayscaleButton;
    JButton brightnessButton;
    JButton closeButton;
    JButton showResizeButton;
    JButton showBrightnessButton;
    JButton backButton;
    JTextField widthTextField;
    JTextField heightTextField;
    JTextField brightnessTextField;
    String filePath = "C:";
    File file;
    JFileChooser fileChooser = new JFileChooser(filePath);
    int h = 900;
    int w = 1200;
    float brightenFactor = 1;
    Font myFont = new Font("Serif", Font.ITALIC, 26);

    ImageViewer(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Image Viewer");
        this.setFont(myFont);
        this.setSize(1500, 800);
        this.setVisible(true);
        this.setResizable(true);

        mainPanel();
    }

    public void mainPanel(){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(3, 2));
        buttonsPanel.setSize(500,200);

        selectFileButton = new JButton("Choose Image");
        selectFileButton.setFont(myFont);
        showImageButton = new JButton("Show Image");
        showImageButton.setFont(myFont);
        brightnessButton = new JButton("Brightness");
        brightnessButton.setFont(myFont);
        grayscaleButton = new JButton("Gray Scale");
        grayscaleButton.setFont(myFont);
        resizeButton = new JButton("Resize");
        resizeButton.setFont(myFont);
        closeButton = new JButton("Exit");
        closeButton.setFont(myFont);

        selectFileButton.addActionListener(this);
        showImageButton.addActionListener(this);
        resizeButton.addActionListener(this);
        brightnessButton.addActionListener(this);
        grayscaleButton.addActionListener(this);
        closeButton.addActionListener(this);

        // Adding the buttons to Grid panel
        buttonsPanel.add(this.selectFileButton);
        buttonsPanel.add(this.showImageButton);
        buttonsPanel.add(this.brightnessButton);
        buttonsPanel.add(this.grayscaleButton);
        buttonsPanel.add(this.resizeButton);
        buttonsPanel.add(this.closeButton);

        mainPanel.add(buttonsPanel);

        this.add(mainPanel);
    }

    public void resizePanel(){
        JPanel resizePanel = new JPanel();
        resizePanel.setLayout(null);

        resizePanel.setBackground(Color.white);

        JLabel label = new JLabel("Resize Section");
        label.setFont(myFont);
        JLabel width = new JLabel("Width:");
        width.setFont(myFont);
        JLabel height = new JLabel("Height:");
        height.setFont(myFont);

        label.setBounds(690, 200, 200, 30);
        width.setBounds(600, 275, 100, 30);
        height.setBounds(600, 325, 100, 30);

        widthTextField = new JTextField();
        widthTextField.setFont(myFont);
        widthTextField.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        heightTextField = new JTextField();
        heightTextField.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        heightTextField.setFont(myFont);

        widthTextField.setBounds(700,275, 200, 35);
        heightTextField.setBounds(700,325, 200, 35);

        showResizeButton = new JButton("Result");
        showResizeButton.setFont(myFont);
        backButton = new JButton("Back");
        backButton.setFont(myFont);

        backButton.setBounds(500, 450, 150, 30);
        showResizeButton.setBounds(900, 450, 150, 30);

        backButton.setBackground(Color.WHITE);
        showResizeButton.setBackground(Color.WHITE);

        backButton.addActionListener(this);
        showResizeButton.addActionListener(this);

        backButton.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        showResizeButton.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));

        resizePanel.add(label);
        resizePanel.add(width);
        resizePanel.add(widthTextField);
        resizePanel.add(height);
        resizePanel.add(heightTextField);
        resizePanel.add(backButton);
        resizePanel.add(showResizeButton);

        this.add(resizePanel);
    }
    public void brightnessPanel(){
        JPanel brightnessPanel = new JPanel();
        brightnessPanel.setBackground(Color.white);
        brightnessPanel.setLayout(null);

        JLabel label1 = new JLabel("Enter a number for brightness:");
        label1.setFont(myFont);
        JLabel label2 = new JLabel("(should be between 0 and 1)");
        label2.setFont(myFont);

        label1.setBounds(370, 180, 400, 30);
        label2.setBounds(400, 220, 300, 25);

        showBrightnessButton = new JButton("Result");
        showBrightnessButton.setFont(myFont);
        showBrightnessButton.setBackground(Color.WHITE);
        showBrightnessButton.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        showBrightnessButton.addActionListener(this);

        backButton = new JButton("Back");
        backButton.setFont(myFont);
        backButton.addActionListener(this);
        backButton.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        backButton.setBackground(Color.WHITE);

        brightnessTextField = new JTextField();
        brightnessTextField.setFont(myFont);

        brightnessTextField.setBounds(820, 190, 200, 50);
        brightnessTextField.setBorder(BorderFactory.createLineBorder(Color.lightGray,5));
        backButton.setBounds(425, 300, 100, 30);
        showBrightnessButton.setBounds(900, 300, 100, 30);

        brightnessPanel.add(label2);
        brightnessPanel.add(label1);
        brightnessPanel.add(backButton);
        brightnessPanel.add(showBrightnessButton);
        brightnessPanel.add(brightnessTextField);


        this.add(brightnessPanel);
    }

    public void chooseFileImage(){
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setDialogTitle("Select an image");

        int option = fileChooser.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION)
            file = fileChooser.getSelectedFile();
    }
    public void showOriginalImage(){
        JFrame tempFrame = new JFrame();
        JPanel tempPanel = new JPanel();
        tempPanel.setSize(1800, 1000);

        tempFrame.setTitle("Image Viewer");
        tempFrame.setSize(1800, 1000);
        tempFrame.setVisible(true);
        tempFrame.setResizable(true);


        ImageIcon imageIcon = new ImageIcon(new ImageIcon(String.valueOf(file)).getImage());
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);

        tempPanel.add(imageLabel);
        tempFrame.add(tempPanel);

    }

    public void grayScaleImage() {
        JFrame tempFrame = new JFrame();
        JPanel tempPanel = new JPanel();

        tempPanel.setSize(1800, 1000);
        tempFrame.setTitle("Image Viewer");
        tempFrame.setSize(1800, 1000);
        tempFrame.setVisible(true);
        tempFrame.setResizable(true);

        try{
            BufferedImage image = ImageIO.read(file);
            BufferedImage grayImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
            Graphics g = grayImage.getGraphics();
            g.drawImage(image, 0, 0, null);
            g.dispose();

            ImageIcon imageIcon = new ImageIcon(grayImage);
            JLabel imageLabel = new JLabel();
            imageLabel.setIcon(imageIcon);

            tempPanel.add(imageLabel);
        }
        catch (Exception e){
            tempFrame.setVisible(false);
            this.getContentPane().removeAll();
            this.revalidate();
            this.repaint();
        }

        tempFrame.add(tempPanel);

    }

    public void showResizeImage(int w, int h){
        JFrame tempFrame = new JFrame();
        JPanel tempPanel = new JPanel();

        ImageIcon imageIcon = new ImageIcon(new ImageIcon(String.valueOf(file)).getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT));
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(imageIcon);

        tempPanel.add(imageLabel);

        tempPanel.setSize(1800, 1000);
        tempFrame.setTitle("Image Viewer");
        tempFrame.setSize(1800, 1000);
        tempFrame.setVisible(true);
        tempFrame.setResizable(true);
        tempFrame.add(tempPanel);

        if(file==null){
            tempFrame.setVisible(false);
            this.getContentPane().removeAll();
            this.revalidate();
            this.repaint();
        }


    }
    public void showBrightnessImage(float f){
        JFrame tempFrame = new JFrame();
        JPanel tempPanel = new JPanel();

        tempPanel.setSize(1800, 1000);
        tempFrame.setTitle("Image Viewer");
        tempFrame.setSize(1800, 1000);
        tempFrame.setVisible(true);
        tempFrame.setResizable(true);

        try{

            BufferedImage image = ImageIO.read(file);

            for(int x = 0; x < image.getWidth(); x++){
                for(int y = 0; y < image.getHeight(); y++){
                    int rgb = image.getRGB(x,y);

                    int transparency = (rgb >> 24) & 0xFF;
                    int red = (rgb >> 16) & 0xFF;
                    int green = (rgb >> 8) & 0xFF;
                    int blue = rgb & 0xFF;

                    red = (int) (red * brightenFactor);
                    green = (int) (green * brightenFactor);
                    blue = (int) (blue * brightenFactor);

                    int newRGB = (transparency << 24) | (red << 16) | (green << 8) | blue;
                    image.setRGB(x , y, newRGB);
                }
            }
            ImageIcon imageIcon = new ImageIcon(image);
            JLabel imageLabel = new JLabel();
            imageLabel.setIcon(imageIcon);

            tempPanel.add(imageLabel);

            tempFrame.add(tempPanel);
        }
        catch(Exception e){
            tempFrame.setVisible(false);
            this.getContentPane().removeAll();
            this.revalidate();
            this.repaint();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==resizeButton){
            this.getContentPane().removeAll();
            this.resizePanel();
            this.revalidate();
            this.repaint();
        }else if(e.getSource()== showImageButton){
            showOriginalImage();
        }else if(e.getSource()==grayscaleButton){
            grayScaleImage();
        }else if(e.getSource()== showResizeButton){
            this.w = Integer.parseInt(widthTextField.getText());
            this.h = Integer.parseInt(heightTextField.getText());
            widthTextField.setText("");
            heightTextField.setText("");
            showResizeImage(w, h);

        }else if(e.getSource()==brightnessButton){
            this.getContentPane().removeAll();
            this.brightnessPanel();
            this.revalidate();
            this.repaint();

        }else if(e.getSource()== showBrightnessButton){
            float brightness = Float.parseFloat(brightnessTextField.getText());
            brightenFactor = brightness;
            brightnessTextField.setText("");
            showBrightnessImage(brightenFactor);
        }else if(e.getSource()== selectFileButton){
            chooseFileImage();
        }else if(e.getSource()==closeButton){
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
        else if(e.getSource()==backButton){
            this.getContentPane().removeAll();
            this.mainPanel();
            this.revalidate();
            this.repaint();
        }
    }
}