/* This file was generated by SableCC (http://www.sablecc.org/). */

package group1.node;

import group1.analysis.*;

public final class TStatic extends Token
{
    public TStatic()
    {
        super.setText("statisk");
    }

    public TStatic(int line, int pos)
    {
        super.setText("statisk");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TStatic(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStatic(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TStatic text.");
    }
}
