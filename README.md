Implementing # Drawing Application - Abstract Factory Pattern

## Overview

This project is an implementation of a drawing application designed using the **Abstract Factory Pattern**.  
The application supports two distinct types of drawing styles:

- **Standard Drawing Factory**: Produces regular geometric shapes such as lines, rectangles, and circles.
- **Hand Drawing Factory**: Produces hand-drawn style shapes, simulating imperfections and irregularities to resemble sketches drawn by hand.(there is a random noise at each execution so the drawing will be different)



- **Factories:**  
    - `NormalDrawingFactory` - Responsible for creating standard shapes.
    - `HandDrawingFactory` - Responsible for creating hand-drawn style shapes.

- **Products:**  
    - `Line`, `Rectangle`, `Circle`

    - we assume that the Rectangle shape uses 4 Line shapes (the reason why there is no AbstractProduct for Rectangle)
