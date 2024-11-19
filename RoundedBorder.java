// Custom Border class for rounded buttons
private static class RoundedBorder implements Border {
    private int radius;

    RoundedBorder(int radius) {
        this.radius = radius;
    }

    public insets getBorderInsets(Component c) {
        return new insets(radius + 1, radius + 1, radius + 1, radius + 1);
    }

    public boolean isBorderOpaque() {
        return true;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }
}
