package me.sassan.base.ui.components;

/**
 * @author sassan
 * 18.11.2023, 2023
 */
public abstract class Component {
    protected int x, y, width, height;

    public Component(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public abstract void drawScreen(int mouseX, int mouseY);
    public abstract void mouseClicked(int mouseX, int mouseY, int mouse);
    public abstract void keyTyped(char typedChar, int key);

    public void updateComponent(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // pasted from my client
    public boolean isMouseOver(int x, int y) {
        return
                (x > this.x)
                        && (x < (this.x + width))
                        && (y > this.y)
                        && (y < (this.y + height));
    }
}
