The **Mars Rover Kata** is a popular programming exercise designed to improve problem-solving and test-driven development (TDD) skills. It simulates the control of a Mars rover navigating a grid-based plateau, addressing challenges such as movement, orientation, and obstacles. Here's a breakdown of the kata:

---

### **Problem Description**
1. **The Plateau:**
   - The rover operates on a rectangular grid (2D space) of defined size, such as 5x5.
   - The grid is bounded, meaning the rover cannot move beyond its edges.

2. **The Rover:**
   - The rover has:
     - A position defined by coordinates `(x, y)` on the grid.
     - An orientation (`N`, `E`, `S`, `W` for North, East, South, West).

3. **Commands:**
   - The rover receives a sequence of commands to navigate:
     - **`L`**: Turn left (90° counterclockwise).
     - **`R`**: Turn right (90° clockwise).
     - **`M`**: Move forward one grid point in the direction it is facing.

4. **Input/Output:**
   - The initial position and orientation of the rover are given, e.g., `1 2 N`.
   - The commands are provided as a string, e.g., `LMLMLMLMM`.
   - After executing the commands, the rover's final position and orientation are output, e.g., `1 3 N`.

5. **Obstacles (optional extension):**
   - Add obstacles on the plateau, represented by coordinates.
   - If the rover encounters an obstacle, it stops moving and reports its last position.

---

### **Example**

#### Input:
- Plateau size: `5x5`
- Initial position: `1 2 N`
- Commands: `LMLMLMLMM`

#### Execution:
1. Start at `1 2 N`.
2. Execute:
   - `L`: Turn left → Facing `W`.
   - `M`: Move forward → `0 2 W`.
   - `L`: Turn left → Facing `S`.
   - `M`: Move forward → `0 1 S`.
   - Repeat...
3. Final position: `1 3 N`.

#### Output:
```
1 3 N
```

---

### **Objectives of the Kata**
1. **Test-Driven Development (TDD):**
   - Write unit tests before implementing the solution.
   - Incrementally develop functionality.

2. **Code Design:**
   - Modularize the rover's functionality (e.g., classes for Plateau, Rover, and Commands).
   - Use clean code principles to ensure readability and maintainability.

3. **Problem Decomposition:**
   - Break down the problem into small, testable parts.
   - For example, implement movement logic separately from command parsing.

4. **Edge Cases:**
   - Handle invalid commands, edge of the grid, and overlapping obstacles.
