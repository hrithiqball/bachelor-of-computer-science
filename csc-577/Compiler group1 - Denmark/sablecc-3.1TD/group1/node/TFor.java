/* This file was generated by SableCC (http://www.sablecc.org/). */

package group1.node;

import group1.analysis.*;

public final class TFor extends Token
{
    public TFor()
    {
        super.setText("til");
    }

    public TFor(int line, int pos)
    {
        super.setText("til");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TFor(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFor(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TFor text.");
    }
}
