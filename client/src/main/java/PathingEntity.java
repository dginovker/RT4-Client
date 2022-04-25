import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public abstract class PathingEntity extends Entity {

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
	public int anInt3359;

	@OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
	public int anInt3372;

	@OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
	public int anInt3374;

	@OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
	public int anInt3379;

	@OriginalMember(owner = "client!fe", name = "bb", descriptor = "I")
	public int anInt3380;

	@OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
	public int anInt3381;

	@OriginalMember(owner = "client!fe", name = "fb", descriptor = "I")
	public int anInt3384;

	@OriginalMember(owner = "client!fe", name = "hb", descriptor = "I")
	public int anInt3386;

	@OriginalMember(owner = "client!fe", name = "nb", descriptor = "Ljava/lang/Object;")
	public Object attachment;

	@OriginalMember(owner = "client!fe", name = "rb", descriptor = "I")
	public int anInt3392;

	@OriginalMember(owner = "client!fe", name = "tb", descriptor = "I")
	public int anInt3394;

	@OriginalMember(owner = "client!fe", name = "ub", descriptor = "I")
	public int anInt3395;

	@OriginalMember(owner = "client!fe", name = "vb", descriptor = "Lclient!ga;")
	protected ParticleSystem aClass47_Sub1_5;

	@OriginalMember(owner = "client!fe", name = "Ab", descriptor = "I")
	public int anInt3400;

	@OriginalMember(owner = "client!fe", name = "Jb", descriptor = "I")
	public int anInt3406;

	@OriginalMember(owner = "client!fe", name = "Ob", descriptor = "I")
	public int anInt3410;

	@OriginalMember(owner = "client!fe", name = "Pb", descriptor = "I")
	public int anInt3411;

	@OriginalMember(owner = "client!fe", name = "Qb", descriptor = "I")
	public int xFine;

	@OriginalMember(owner = "client!fe", name = "Ub", descriptor = "I")
	public int anInt3416;

	@OriginalMember(owner = "client!fe", name = "ac", descriptor = "I")
	public int zFine;

	@OriginalMember(owner = "client!fe", name = "dc", descriptor = "I")
	public int anInt3424;

	@OriginalMember(owner = "client!fe", name = "fc", descriptor = "I")
	public int anInt3426;

	@OriginalMember(owner = "client!fe", name = "hc", descriptor = "I")
	public int anInt3428;

	@OriginalMember(owner = "client!fe", name = "mc", descriptor = "I")
	public int anInt3431;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "[I")
	public final int[] movementQueueZ = new int[10];

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
	public int anInt3358 = 0;

	@OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
	private int anInt3367 = 0;

	@OriginalMember(owner = "client!fe", name = "L", descriptor = "[I")
	public final int[] anIntArray319 = new int[4];

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "[I")
	public final int[] movementQueueX = new int[10];

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
	public int anInt3360 = 0;

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
	public int seqId = -1;

	@OriginalMember(owner = "client!fe", name = "ab", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!fe", name = "M", descriptor = "Z")
	public boolean aBoolean167 = false;

	@OriginalMember(owner = "client!fe", name = "db", descriptor = "I")
	public int anInt3382 = 0;

	@OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
	public int anInt3371 = 0;

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
	public int anInt3363 = 0;

	@OriginalMember(owner = "client!fe", name = "yb", descriptor = "I")
	private int anInt3398 = 0;

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
	public int anInt3365 = -1;

	@OriginalMember(owner = "client!fe", name = "gb", descriptor = "I")
	public int anInt3385 = 0;

	@OriginalMember(owner = "client!fe", name = "pb", descriptor = "I")
	public int anInt3390 = 0;

	@OriginalMember(owner = "client!fe", name = "mb", descriptor = "[B")
	public final byte[] movementQueueSpeed = new byte[10];

	@OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
	public int anInt3376 = 32;

	@OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
	public int anInt3370 = -1;

	@OriginalMember(owner = "client!fe", name = "Bb", descriptor = "Z")
	private boolean aBoolean170 = false;

	@OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
	private int anInt3383 = 0;

	@OriginalMember(owner = "client!fe", name = "ib", descriptor = "I")
	public int anInt3387 = 0;

	@OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
	public int anInt3377 = 0;

	@OriginalMember(owner = "client!fe", name = "Eb", descriptor = "[Lclient!ub;")
	public final Class147[] aClass147Array3 = new Class147[12];

	@OriginalMember(owner = "client!fe", name = "Lb", descriptor = "I")
	public int anInt3408 = 100;

	@OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
	public int anInt3375 = 0;

	@OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
	public int anInt3378 = -1000;

	@OriginalMember(owner = "client!fe", name = "Rb", descriptor = "I")
	protected int anInt3413 = -32768;

	@OriginalMember(owner = "client!fe", name = "Nb", descriptor = "I")
	public int movementQueueSize = 0;

	@OriginalMember(owner = "client!fe", name = "Zb", descriptor = "I")
	public int anInt3420 = 0;

	@OriginalMember(owner = "client!fe", name = "cc", descriptor = "I")
	private int anInt3423 = 0;

	@OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
	public int anInt3361 = 0;

	@OriginalMember(owner = "client!fe", name = "Yb", descriptor = "I")
	private int anInt3419 = 0;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
	private int anInt3355 = 0;

	@OriginalMember(owner = "client!fe", name = "Mb", descriptor = "[I")
	public final int[] anIntArray321 = new int[4];

	@OriginalMember(owner = "client!fe", name = "zb", descriptor = "I")
	public int anInt3399 = 0;

	@OriginalMember(owner = "client!fe", name = "Db", descriptor = "I")
	public int anInt3402 = 0;

	@OriginalMember(owner = "client!fe", name = "Vb", descriptor = "I")
	public int anInt3417 = 0;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
	public int anInt3352 = 0;

	@OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
	public int anInt3373 = -1;

	@OriginalMember(owner = "client!fe", name = "Fb", descriptor = "Z")
	public boolean aBoolean171 = false;

	@OriginalMember(owner = "client!fe", name = "xb", descriptor = "I")
	public int anInt3397 = 0;

	@OriginalMember(owner = "client!fe", name = "kb", descriptor = "I")
	public int anInt3388 = -1;

	@OriginalMember(owner = "client!fe", name = "Sb", descriptor = "I")
	public int anInt3414 = 0;

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
	public int anInt3366 = -1;

	@OriginalMember(owner = "client!fe", name = "gc", descriptor = "I")
	private int anInt3427 = 0;

	@OriginalMember(owner = "client!fe", name = "Tb", descriptor = "I")
	private int anInt3415 = 1;

	@OriginalMember(owner = "client!fe", name = "Kb", descriptor = "I")
	public int anInt3407 = 0;

	@OriginalMember(owner = "client!fe", name = "ic", descriptor = "[I")
	public final int[] anIntArray322 = new int[4];

	@OriginalMember(owner = "client!fe", name = "Ib", descriptor = "I")
	public int anInt3405 = 0;

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
	private int anInt3357 = 0;

	@OriginalMember(owner = "client!fe", name = "wb", descriptor = "I")
	public int anInt3396 = 0;

	@OriginalMember(owner = "client!fe", name = "jc", descriptor = "I")
	public int anInt3429 = 0;

	@OriginalMember(owner = "client!fe", name = "kc", descriptor = "I")
	public int anInt3430 = 0;

	@OriginalMember(owner = "client!fe", name = "ec", descriptor = "I")
	public int anInt3425 = 0;

	@OriginalMember(owner = "client!fe", name = "Wb", descriptor = "Lclient!na;")
	public JagString aClass100_640 = null;

	@OriginalMember(owner = "client!fe", name = "oc", descriptor = "I")
	public int anInt3432 = -1;

	@OriginalMember(owner = "client!fe", name = "Xb", descriptor = "I")
	public int anInt3418 = -1;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)Lclient!ck;")
	public final BasType method2681() {
		@Pc(7) int local7 = this.method2688();
		return local7 == -1 ? Static4.aClass20_1 : Static90.method1856(local7);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)Z")
	public boolean method2682() {
		return false;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIZ)V")
	public final void method2683(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (this.seqId != -1 && Static36.get(this.seqId).anInt5349 == 1) {
			this.seqId = -1;
		}
		if (!arg3) {
			@Pc(32) int local32 = arg1 - this.movementQueueX[0];
			@Pc(40) int local40 = arg2 - this.movementQueueZ[0];
			if (local32 >= -8 && local32 <= 8 && local40 >= -8 && local40 <= 8) {
				if (this.movementQueueSize < 9) {
					this.movementQueueSize++;
				}
				for (@Pc(72) int local72 = this.movementQueueSize; local72 > 0; local72--) {
					this.movementQueueX[local72] = this.movementQueueX[local72 - 1];
					this.movementQueueZ[local72] = this.movementQueueZ[local72 - 1];
					this.movementQueueSpeed[local72] = this.movementQueueSpeed[local72 - 1];
				}
				this.movementQueueSpeed[0] = 1;
				this.movementQueueX[0] = arg1;
				this.movementQueueZ[0] = arg2;
				return;
			}
		}
		this.anInt3417 = 0;
		this.movementQueueX[0] = arg1;
		this.movementQueueZ[0] = arg2;
		this.movementQueueSize = 0;
		this.anInt3405 = 0;
		this.zFine = arg0 * 64 + this.movementQueueZ[0] * 128;
		this.xFine = arg0 * 64 + this.movementQueueX[0] * 128;
		if (GlRenderer.enabled && PlayerList.self == this) {
			Static86.setInstantFade();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBI)V")
	public final void method2684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.movementQueueX[0];
		@Pc(15) int local15 = this.movementQueueZ[0];
		if (arg1 == 0) {
			local10--;
			local15++;
		}
		if (this.seqId != -1 && Static36.get(this.seqId).anInt5349 == 1) {
			this.seqId = -1;
		}
		if (this.movementQueueSize < 9) {
			this.movementQueueSize++;
		}
		for (@Pc(50) int local50 = this.movementQueueSize; local50 > 0; local50--) {
			this.movementQueueX[local50] = this.movementQueueX[local50 - 1];
			this.movementQueueZ[local50] = this.movementQueueZ[local50 - 1];
			this.movementQueueSpeed[local50] = this.movementQueueSpeed[local50 - 1];
		}
		if (arg1 == 1) {
			local15++;
		}
		this.movementQueueSpeed[0] = (byte) arg0;
		if (arg1 == 2) {
			local15++;
			local10++;
		}
		if (arg1 == 3) {
			local10--;
		}
		if (arg1 == 4) {
			local10++;
		}
		if (arg1 == 5) {
			local15--;
			local10--;
		}
		if (arg1 == 6) {
			local15--;
		}
		if (arg1 == 7) {
			local15--;
			local10++;
		}
		this.movementQueueX[0] = local10;
		this.movementQueueZ[0] = local15;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLclient!ak;I)V")
	protected final void method2685(@OriginalArg(1) Model arg0, @OriginalArg(2) int arg1) {
		Static102.anInt2680 = 0;
		Static101.anInt2640 = 0;
		Static62.anInt1938 = 0;
		@Pc(21) BasType local21 = this.method2681();
		@Pc(24) int local24 = local21.anInt1059;
		@Pc(27) int local27 = local21.anInt1050;
		if (local24 == 0 || local27 == 0) {
			return;
		}
		@Pc(39) int local39 = MathUtils.sin[arg1];
		@Pc(43) int local43 = MathUtils.cos[arg1];
		@Pc(48) int local48 = -local24 / 2;
		@Pc(53) int local53 = -local27 / 2;
		@Pc(64) int local64 = local53 * local43 - local48 * local39 >> 16;
		@Pc(75) int local75 = local39 * local53 + local43 * local48 >> 16;
		@Pc(87) int local87 = Static207.method3685(Static55.level, local75 + this.xFine, this.zFine + local64);
		@Pc(91) int local91 = local24 / 2;
		@Pc(96) int local96 = -local27 / 2;
		@Pc(106) int local106 = local91 * local43 + local96 * local39 >> 16;
		@Pc(110) int local110 = local27 / 2;
		@Pc(121) int local121 = local96 * local43 - local91 * local39 >> 16;
		@Pc(134) int local134 = Static207.method3685(Static55.level, local106 + this.xFine, this.zFine - -local121);
		@Pc(139) int local139 = -local24 / 2;
		@Pc(150) int local150 = local110 * local43 - local39 * local139 >> 16;
		@Pc(154) int local154 = local27 / 2;
		@Pc(158) int local158 = local24 / 2;
		@Pc(169) int local169 = local39 * local110 + local43 * local139 >> 16;
		@Pc(179) int local179 = local154 * local43 - local39 * local158 >> 16;
		@Pc(189) int local189 = local39 * local154 + local43 * local158 >> 16;
		@Pc(201) int local201 = Static207.method3685(Static55.level, this.xFine + local169, local150 + this.zFine);
		@Pc(212) int local212 = local134 > local87 ? local87 : local134;
		@Pc(224) int local224 = Static207.method3685(Static55.level, local189 + this.xFine, local179 + this.zFine);
		@Pc(231) int local231 = local224 > local201 ? local201 : local224;
		@Pc(238) int local238 = local224 > local134 ? local134 : local224;
		@Pc(245) int local245 = local201 <= local87 ? local201 : local87;
		Static101.anInt2640 = (int) (Math.atan2((double) (local212 - local231), (double) local27) * 325.95D) & 0x7FF;
		if (Static101.anInt2640 != 0) {
			arg0.method4574(Static101.anInt2640);
		}
		Static102.anInt2680 = (int) (Math.atan2((double) (local245 - local238), (double) local24) * 325.95D) & 0x7FF;
		if (Static102.anInt2680 != 0) {
			arg0.method4564(Static102.anInt2680);
		}
		Static62.anInt1938 = local224 + local87;
		if (local201 + local134 < Static62.anInt1938) {
			Static62.anInt1938 = local201 + local134;
		}
		Static62.anInt1938 = (Static62.anInt1938 >> 1) - this.anInt3424;
		if (Static62.anInt1938 != 0) {
			arg0.method4575(0, Static62.anInt1938, 0);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)V")
	public final void method2686(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			if (arg1 >= this.anIntArray319[local11]) {
				this.anIntArray322[local11] = arg2;
				this.anIntArray321[local11] = arg0;
				this.anIntArray319[local11] = arg1 + 70;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ak;B)V")
	protected final void method2687(@OriginalArg(0) Model arg0) {
		@Pc(16) BasType local16 = this.method2681();
		if (local16.anInt1064 == 0 && local16.anInt1041 == 0) {
			return;
		}
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aBoolean167 && this.anInt3414 != 0) {
			local28 = local16.anInt1041;
			if (this.anInt3414 >= 0) {
				local26 = local16.anInt1064;
			} else {
				local26 = -local16.anInt1064;
			}
		}
		@Pc(101) int local101;
		@Pc(106) int local106;
		@Pc(134) int local134;
		@Pc(138) int local138;
		if (this.anInt3419 != local26) {
			this.anInt3419 = local26;
			if (this.anInt3355 > 0 && this.anInt3383 < local26) {
				local101 = this.anInt3355 * this.anInt3355 / (local16.anInt1055 * 2);
				local106 = local26 - this.anInt3383;
				if (local101 <= local106) {
					this.aBoolean170 = true;
					this.anInt3398 = (local26 + this.anInt3383 - local101) / 2;
					local134 = local16.anInt1040 * local16.anInt1040 / (local16.anInt1055 * 2);
					local138 = local26 - local134;
					if (this.anInt3398 < local138) {
						this.anInt3398 = local138;
					}
				} else {
					this.aBoolean170 = false;
				}
			} else if (this.anInt3355 < 0 && this.anInt3383 > local26) {
				local101 = this.anInt3355 * this.anInt3355 / (local16.anInt1055 * 2);
				local106 = local26 - this.anInt3383;
				if (local106 >= local101) {
					this.aBoolean170 = true;
					this.anInt3398 = (this.anInt3383 + local101 + local26) / 2;
					local134 = local16.anInt1040 * local16.anInt1040 / (local16.anInt1055 * 2);
					local138 = local134 + local26;
					if (this.anInt3398 > local138) {
						this.anInt3398 = local138;
					}
				} else {
					this.aBoolean170 = false;
				}
			} else {
				this.aBoolean170 = false;
			}
		}
		if (this.anInt3355 == 0) {
			local101 = this.anInt3419 - this.anInt3383;
			if (-local16.anInt1055 < local101 && local16.anInt1055 > local101) {
				this.anInt3383 = this.anInt3419;
			} else {
				this.aBoolean170 = true;
				local106 = local16.anInt1040 * local16.anInt1040 / (local16.anInt1055 * 2);
				this.anInt3398 = (this.anInt3419 + this.anInt3383) / 2;
				if (local101 >= 0) {
					local134 = this.anInt3419 - local106;
					this.anInt3355 = local16.anInt1055;
					if (local134 > this.anInt3398) {
						this.anInt3398 = local134;
					}
				} else {
					this.anInt3355 = -local16.anInt1055;
					local134 = local106 + this.anInt3419;
					if (this.anInt3398 > local134) {
						this.anInt3398 = local134;
					}
				}
			}
		} else if (this.anInt3355 > 0) {
			if (this.anInt3383 >= this.anInt3398) {
				this.aBoolean170 = false;
			}
			if (!this.aBoolean170) {
				this.anInt3355 -= local16.anInt1055;
				if (this.anInt3355 < 0) {
					this.anInt3355 = 0;
				}
			} else if (local16.anInt1040 > this.anInt3355) {
				this.anInt3355 += local16.anInt1055;
			}
		} else {
			if (this.anInt3398 >= this.anInt3383) {
				this.aBoolean170 = false;
			}
			if (!this.aBoolean170) {
				this.anInt3355 += local16.anInt1055;
				if (this.anInt3355 > 0) {
					this.anInt3355 = 0;
				}
			} else if (this.anInt3355 > -local16.anInt1040) {
				this.anInt3355 -= local16.anInt1055;
			}
		}
		this.anInt3383 += this.anInt3355;
		if (this.anInt3383 != 0) {
			local101 = this.anInt3383 >> 5 & 0x7FF;
			local106 = arg0.method4549() / 2;
			arg0.method4575(0, -local106, 0);
			arg0.method4564(local101);
			arg0.method4575(0, local106, 0);
		}
		if (local28 != this.anInt3367) {
			this.anInt3367 = local28;
			if (this.anInt3423 > 0 && this.anInt3427 < local28) {
				local101 = this.anInt3423 * this.anInt3423 / (local16.anInt1065 * 2);
				local106 = local28 - this.anInt3427;
				if (local101 > local106) {
					this.aBoolean169 = false;
				} else {
					this.anInt3357 = (this.anInt3427 + local28 - local101) / 2;
					this.aBoolean169 = true;
					local134 = local16.anInt1063 * local16.anInt1063 / (local16.anInt1065 * 2);
					local138 = local28 - local134;
					if (this.anInt3357 < local138) {
						this.anInt3357 = local138;
					}
				}
			} else if (this.anInt3423 < 0 && this.anInt3427 > local28) {
				local106 = local28 - this.anInt3427;
				local101 = this.anInt3423 * this.anInt3423 / (local16.anInt1065 * 2);
				if (local106 >= local101) {
					this.anInt3357 = (local101 + this.anInt3427 + local28) / 2;
					this.aBoolean169 = true;
					local134 = local16.anInt1063 * local16.anInt1063 / (local16.anInt1065 * 2);
					local138 = local134 + local28;
					if (local138 < this.anInt3357) {
						this.anInt3357 = local138;
					}
				} else {
					this.aBoolean169 = false;
				}
			} else {
				this.aBoolean169 = false;
			}
		}
		if (this.anInt3423 == 0) {
			local101 = this.anInt3367 - this.anInt3427;
			if (local101 > -local16.anInt1065 && local16.anInt1065 > local101) {
				this.anInt3427 = this.anInt3367;
			} else {
				this.anInt3357 = (this.anInt3367 + this.anInt3427) / 2;
				this.aBoolean169 = true;
				local106 = local16.anInt1063 * local16.anInt1063 / (local16.anInt1065 * 2);
				if (local101 < 0) {
					this.anInt3423 = -local16.anInt1065;
					local134 = local106 + this.anInt3367;
					if (this.anInt3357 > local134) {
						this.anInt3357 = local134;
					}
				} else {
					this.anInt3423 = local16.anInt1065;
					local134 = this.anInt3367 - local106;
					if (this.anInt3357 < local134) {
						this.anInt3357 = local134;
					}
				}
			}
		} else if (this.anInt3423 > 0) {
			if (this.anInt3427 >= this.anInt3357) {
				this.aBoolean169 = false;
			}
			if (!this.aBoolean169) {
				this.anInt3423 -= local16.anInt1065;
				if (this.anInt3423 < 0) {
					this.anInt3423 = 0;
				}
			} else if (this.anInt3423 < local16.anInt1063) {
				this.anInt3423 += local16.anInt1065;
			}
		} else {
			if (this.anInt3357 >= this.anInt3427) {
				this.aBoolean169 = false;
			}
			if (!this.aBoolean169) {
				this.anInt3423 += local16.anInt1065;
				if (this.anInt3423 > 0) {
					this.anInt3423 = 0;
				}
			} else if (-local16.anInt1063 < this.anInt3423) {
				this.anInt3423 -= local16.anInt1065;
			}
		}
		this.anInt3427 += this.anInt3423;
		if (this.anInt3427 == 0) {
			return;
		}
		local101 = this.anInt3427 >> 5 & 0x7FF;
		local106 = arg0.method4549() / 2;
		arg0.method4575(0, -local106, 0);
		arg0.method4574(local101);
		arg0.method4575(0, local106, 0);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)I")
	protected abstract int method2688();

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
	public final void method2689() {
		this.movementQueueSize = 0;
		this.anInt3405 = 0;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)I")
	public final int method2691() {
		return this.anInt3413 == -32768 ? 200 : -this.anInt3413;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	public final void method2692(@OriginalArg(0) int arg0) {
		this.anInt3415 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)I")
	public int getSize() {
		return this.anInt3415;
	}
}
