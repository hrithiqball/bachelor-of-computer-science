/* This file was generated by SableCC (http://www.sablecc.org/). */

package group1.node;

import group1.analysis.*;

public final class TIf extends Token
{
    public TIf()
    {
        super.setText("hvis");
    }

    public TIf(int line, int pos)
    {
        super.setText("hvis");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TIf(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIf(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TIf text.");
    }
}