/* This file was generated by SableCC (http://www.sablecc.org/). */

package group1.node;

import group1.analysis.*;

public final class TVoid extends Token
{
    public TVoid()
    {
        super.setText("ugyldig");
    }

    public TVoid(int line, int pos)
    {
        super.setText("ugyldig");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TVoid(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVoid(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TVoid text.");
    }
}
