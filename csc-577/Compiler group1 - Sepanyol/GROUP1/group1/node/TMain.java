/* This file was generated by SableCC (http://www.sablecc.org/). */

package group1.node;

import group1.analysis.*;

public final class TMain extends Token
{
    public TMain()
    {
        super.setText("principal");
    }

    public TMain(int line, int pos)
    {
        super.setText("principal");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TMain(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMain(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TMain text.");
    }
}
