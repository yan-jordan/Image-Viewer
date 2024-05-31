![Third Photo](https://github.com/yan-jordan/Image-Viewer/assets/151916970/4073b1b5-422a-4e99-8adf-fef3a7218812)
![First Photo](https://github.com/yan-jordan/Image-Viewer/assets/151916970/c8bf801b-05c0-464b-9654-ff8e3337eb84)
![Second Photo](https://github.com/yan-jordan/Image-Viewer/assets/151916970/c5e438ea-4388-4f8b-974a-6ef3c65b6102)

# Image Viewer

This Java application allows users to view and manipulate images. The functionalities include resizing, converting to grayscale, adjusting brightness, and viewing the original image.

## Features

- **Select Image**: Choose an image file from your system.
- **Show Image**: Display the original image.
- **Resize Image**: Resize the image to specified dimensions.
- **Convert to Grayscale**: Convert the image to grayscale.
- **Adjust Brightness**: Adjust the brightness of the image.
- **Exit**: Close the application.

## Prerequisites

- Java Development Kit (JDK) installed on your machine.
- Swing library (included in standard JDK).

## Code Overview

### Main Class: `ImageViewer`

- **Constructor**: `ImageViewer()`
  - Sets up the main frame and initializes the main panel with buttons for various functionalities.

- **Method**: `mainPanel()`
  - Sets up the main panel with buttons for selecting, showing, resizing, converting to grayscale, adjusting brightness, and exiting.

- **Method**: `resizePanel()`
  - Sets up the panel for resizing the image.

- **Method**: `brightnessPanel()`
  - Sets up the panel for adjusting the brightness of the image.

- **Method**: `chooseFileImage()`
  - Opens a file chooser dialog to select an image file.

- **Method**: `showOriginalImage()`
  - Displays the original selected image in a new frame.

- **Method**: `grayScaleImage()`
  - Converts the selected image to grayscale and displays it in a new frame.

- **Method**: `showResizeImage(int w, int h)`
  - Displays the resized image based on the specified width and height in a new frame.

- **Method**: `showBrightnessImage(float f)`
  - Adjusts the brightness of the image based on the specified factor and displays it in a new frame.

- **Method**: `actionPerformed(ActionEvent e)`
  - Handles button click events for various functionalities.

### Notes

- If the application UI appears distorted or not functioning properly, try resizing the window.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## Contact

For any questions or feedback, please reach out to [pouyanmehdibeik@gmail.com]


# Image Viewer

This Java application allows users to view and manipulate images. The functionalities include resizing, converting to grayscale, adjusting brightness, and viewing the original image.

## Features

- **Select Image**: Choose an image file from your system.
- **Show Image**: Display the original image.
- **Resize Image**: Resize the image to specified dimensions.
- **Convert to Grayscale**: Convert the image to grayscale.
- **Adjust Brightness**: Adjust the brightness of the image.
- **Exit**: Close the application.

## Prerequisites

- Java Development Kit (JDK) installed on your machine.
- Swing library (included in standard JDK).

## Code Overview

### Main Class: `ImageViewer`

- **Constructor**: `ImageViewer()`
  - Sets up the main frame and initializes the main panel with buttons for various functionalities.

- **Method**: `mainPanel()`
  - Sets up the main panel with buttons for selecting, showing, resizing, converting to grayscale, adjusting brightness, and exiting.

- **Method**: `resizePanel()`
  - Sets up the panel for resizing the image.

- **Method**: `brightnessPanel()`
  - Sets up the panel for adjusting the brightness of the image.

- **Method**: `chooseFileImage()`
  - Opens a file chooser dialog to select an image file.

- **Method**: `showOriginalImage()`
  - Displays the original selected image in a new frame.

- **Method**: `grayScaleImage()`
  - Converts the selected image to grayscale and displays it in a new frame.

- **Method**: `showResizeImage(int w, int h)`
  - Displays the resized image based on the specified width and height in a new frame.

- **Method**: `showBrightnessImage(float f)`
  - Adjusts the brightness of the image based on the specified factor and displays it in a new frame.

- **Method**: `actionPerformed(ActionEvent e)`
  - Handles button click events for various functionalities.

### Notes

- If the application UI appears distorted or not functioning properly, try resizing the window.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## Contact

For any questions or feedback, please reach out to [pouyanmehdibeik@gmail.com]

