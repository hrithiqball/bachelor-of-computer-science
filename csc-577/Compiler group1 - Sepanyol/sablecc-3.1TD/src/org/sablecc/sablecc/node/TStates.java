/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.sablecc.sablecc.node;

import org.sablecc.sablecc.analysis.*;

public final class TStates extends Token
{
  public TStates()
  {
    super.setText("States");
  }

  public TStates(int line, int pos)
  {
    super.setText("States");
    setLine(line);
    setPos(pos);
  }

  public Object clone()
  {
    return new TStates(getLine(), getPos());
  }

  public void apply(Switch sw)
  {
    ((Analysis) sw).caseTStates(this);
  }

  public void setText(String text)
  {
    throw new RuntimeException("Cannot change TStates text.");
  }
}
