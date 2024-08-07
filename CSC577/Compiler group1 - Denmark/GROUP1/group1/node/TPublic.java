/* This file was generated by SableCC (http://www.sablecc.org/). */

package group1.node;

import group1.analysis.*;

public final class TPublic extends Token
{
    public TPublic()
    {
        super.setText("offentlig");
    }

    public TPublic(int line, int pos)
    {
        super.setText("offentlig");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TPublic(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPublic(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TPublic text.");
    }
}
