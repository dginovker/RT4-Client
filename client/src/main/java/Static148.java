import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!li", name = "l", descriptor = "Lclient!ge;")
	public static Cache masterCache;

	@OriginalMember(owner = "client!li", name = "t", descriptor = "I")
	public static int anInt3534;

	@OriginalMember(owner = "client!li", name = "v", descriptor = "Lclient!va;")
	public static MidiPcmStream musicStream;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "Lclient!sc;")
	public static HashTable aClass133_13;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "I")
	public static int screenUpperY;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "[Lclient!mj;")
	public static final CollisionMap[] collisionMaps = new CollisionMap[4];

	@OriginalMember(owner = "client!li", name = "p", descriptor = "Lclient!na;")
	public static final JagString aClass100_677 = Static28.parse("::rebuild");

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)V")
	public static void method2765(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !MidiPlayer.jingle) {
			Static241.method4548();
		} else if (arg0 != -1 && (Static221.anInt4363 != arg0 || !Static136.method2655()) && Preferences.musicVolume != 0 && !MidiPlayer.jingle) {
			Static257.method526(arg0, Static130.js5Archive6, Preferences.musicVolume);
		}
		Static221.anInt4363 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
	public static void method2766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static7.varps[arg0] = arg1;
		@Pc(21) LongNode local21 = (LongNode) Static199.aClass133_20.get((long) arg0);
		if (local21 == null) {
			local21 = new LongNode(MonotonicClock.currentTimeMillis() + 500L);
			Static199.aClass133_20.put(local21, (long) arg0);
		} else {
			local21.value = MonotonicClock.currentTimeMillis() + 500L;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Lclient!dd;")
	public static SoftwareFont method2768(@OriginalArg(1) int arg0) {
		@Pc(16) SoftwareFont local16 = (SoftwareFont) Static139.aClass99_22.get((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(26) byte[] local26 = Static261.js5Archive13.getFile(arg0, 0);
		local16 = new SoftwareFont(local26);
		local16.setNameIcons(Sprites.nameIcons, null);
		Static139.aClass99_22.put(local16, (long) arg0);
		return local16;
	}
}
