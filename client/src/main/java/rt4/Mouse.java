package rt4;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import javax.swing.*;

@OriginalClass("client!ug")
public final class Mouse implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int clickX = 0;
	@OriginalMember(owner = "client!em", name = "y", descriptor = "I")
	public static int clickY = 0;
	@OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
	public static int lastMouseY = 0;
	@OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
	public static int lastMouseX = 0;
    @OriginalMember(owner = "client!he", name = "bb", descriptor = "Lclient!ug;")
    public static Mouse instance = new Mouse();
	@OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
	public static volatile int anInt2467 = 0;
    @OriginalMember(owner = "client!lk", name = "Z", descriptor = "I")
    public static int clickButton = 0;
	@OriginalMember(owner = "client!bl", name = "Q", descriptor = "I")
	public static int pressedButton = 0;
    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "J")
	public static volatile long aLong161 = 0L;
    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static volatile int anInt1034 = 0;
	@OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
	public static volatile int anInt1759 = 0;
	@OriginalMember(owner = "client!kf", name = "c", descriptor = "J")
	public static long clickTime = 0L;
	@OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
	public static volatile int anInt1313 = 0;
	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	public static volatile int anInt4039 = -1;
	@OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
	public static volatile int anInt3521 = -1;
	@OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
	public static volatile int anInt4973 = 0;
    @OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
    public static int anInt5850 = 0;
    @OriginalMember(owner = "client!ok", name = "f", descriptor = "J")
	public static long prevClickTime = 0L;
    public int mouseWheelX;
	public int mouseWheelY;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static void stop(@OriginalArg(1) Component arg0) {
        arg0.removeMouseListener(instance);
        arg0.removeMouseMotionListener(instance);
        arg0.removeFocusListener(instance);
        anInt1759 = 0;
    }

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	public static void quit() {
		if (instance != null) {
			@Pc(5) Mouse local5 = instance;
			synchronized (instance) {
				instance = null;
			}
		}
	}

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
    public static void loop() {
        @Pc(2) Mouse local2 = instance;
        synchronized (instance) {
            pressedButton = anInt1759;
            lastMouseX = anInt3521;
            lastMouseY = anInt4039;
            clickButton = anInt1313;
            clickX = anInt1034;
            anInt2467++;
            clickY = anInt4973;
            clickTime = aLong161;
            anInt1313 = 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static void start(@OriginalArg(0) Component arg0) {
        arg0.addMouseListener(instance);
        arg0.addMouseMotionListener(instance);
        arg0.addFocusListener(instance);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)I")
    public static int getIdleLoops() {
        return anInt2467;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
    public static void setIdleLoops(@OriginalArg(1) int arg0) {
        @Pc(10) Mouse local10 = instance;
        synchronized (instance) {
            anInt2467 = arg0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseMoved(@OriginalArg(0) MouseEvent arg0) {
		if (instance != null) {
			anInt2467 = 0;
			anInt3521 = arg0.getX();
			anInt4039 = arg0.getY();
		}
	}

	@OriginalMember(owner = "client!ug", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (instance != null) {
			anInt1759 = 0;
		}
	}

	@OriginalMember(owner = "client!ug", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseDragged(@OriginalArg(0) MouseEvent event) {
		int x = event.getX();
		int y = event.getY();
		if (SwingUtilities.isMiddleMouseButton(event)) {
			int accelX = this.mouseWheelX - x;
			int accelY = this.mouseWheelY - y;
			this.mouseWheelX = x;
			this.mouseWheelY = y;
			Camera.yawTarget += accelX * 2;
			Camera.pitchTarget -= accelY * 2;
			Camera.clampCameraAngle();
			return;
		}

		if (instance != null) {
			anInt2467 = 0;
			anInt3521 = x;
			anInt4039 = y;
		}
	}

	@OriginalMember(owner = "client!ug", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseReleased(@OriginalArg(0) MouseEvent arg0) {
		if (instance != null) {
			anInt2467 = 0;
			anInt1759 = 0;
			@Pc(14) int local14 = arg0.getModifiers();
			if ((local14 & 0x10) == 0) {
			}
			if ((local14 & 0x4) == 0) {
			}
			if ((local14 & 0x8) == 0) {
			}
		}
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ug", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final void mouseClicked(@OriginalArg(0) MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!ug", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public final void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ug", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mousePressed(@OriginalArg(0) MouseEvent event) {
		if (SwingUtilities.isMiddleMouseButton(event)) {
			this.mouseWheelX = event.getX();
			this.mouseWheelY = event.getY();
			return;
		}

		if (instance != null) {
			anInt2467 = 0;
			anInt1034 = event.getX();
			anInt4973 = event.getY();
			aLong161 = MonotonicClock.currentTimeMillis();
			if ((event.getModifiersEx() & MouseEvent.BUTTON3_DOWN_MASK) == 0) {
				anInt1313 = 1;
				anInt1759 = 1;
			} else {
				anInt1313 = 2;
				anInt1759 = 2;
			}
			@Pc(29) int local29 = event.getModifiers();
			if ((local29 & 0x10) == 0) {
			}
			if ((local29 & 0x4) != 0) {
			}
			if ((local29 & 0x8) != 0) {
			}
		}
		if (event.isPopupTrigger()) {
			event.consume();
		}
	}

	@OriginalMember(owner = "client!ug", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseExited(@OriginalArg(0) MouseEvent arg0) {
		if (instance != null) {
			anInt2467 = 0;
			anInt3521 = -1;
			anInt4039 = -1;
		}
	}

	@OriginalMember(owner = "client!ug", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
	@Override
	public final synchronized void mouseEntered(@OriginalArg(0) MouseEvent arg0) {
		if (instance != null) {
			anInt2467 = 0;
			anInt3521 = arg0.getX();
			anInt4039 = arg0.getY();
		}
	}
}
