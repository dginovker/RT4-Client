package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
	public static int anInt3291 = 0;

	@OriginalMember(owner = "client!ke", name = "Y", descriptor = "[I")
	public static final int[] anIntArray309 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLclient!wk;Z)V")
	public static void closeInterface(@OriginalArg(0) boolean arg0, @OriginalArg(1) ComponentPointer arg1) {
		@Pc(9) int local9 = (int) arg1.key;
		@Pc(16) int local16 = arg1.anInt5878;
		arg1.unlink();
		if (arg0) {
			InterfaceList.method2275(local16);
		}
		Static273.method3214(local16);
		@Pc(32) Component local32 = InterfaceList.getComponent(local9);
		if (local32 != null) {
			InterfaceList.redraw(local32);
		}
		@Pc(41) int local41 = Static231.anInt5204;
		@Pc(43) int local43;
		for (local43 = 0; local43 < local41; local43++) {
			if (Static2.method5(Static39.aShortArray6[local43])) {
				Static200.method3628(local43);
			}
		}
		if (Static231.anInt5204 == 1) {
			Static60.aBoolean108 = false;
			Static133.method4012(Static183.anInt4271, Static24.anInt761, Static229.anInt5138, Static13.anInt436);
		} else {
			Static133.method4012(Static183.anInt4271, Static24.anInt761, Static229.anInt5138, Static13.anInt436);
			local43 = Fonts.b12Full.getStringWidth(LocalizedText.CHOOSE_OPTION);
			for (@Pc(75) int local75 = 0; local75 < Static231.anInt5204; local75++) {
				@Pc(88) int local88 = Fonts.b12Full.getStringWidth(Static269.method2228(local75));
				if (local43 < local88) {
					local43 = local88;
				}
			}
			Static13.anInt436 = Static231.anInt5204 * 15 + (Static261.aBoolean298 ? 26 : 22);
			Static24.anInt761 = local43 + 8;
		}
		if (InterfaceList.topLevelInterface != -1) {
			Static54.runScripts(1, InterfaceList.topLevelInterface);
		}
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(B)V")
	public static void method2608() {
		@Pc(7) int local7 = 0;
		for (@Pc(23) int local23 = 0; local23 < 104; local23++) {
			for (@Pc(30) int local30 = 0; local30 < 104; local30++) {
				if (Static254.method4348(true, local23, local30, SceneGraph.tiles, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!rh;IIIIIIIZ)V")
	public static void method2610(@OriginalArg(0) PlainTile arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static149.anInt3555;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static217.anInt4903;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = SceneGraph.tileHeights[arg1][arg6][arg7] - Static123.anInt3947;
		@Pc(49) int local49 = SceneGraph.tileHeights[arg1][arg6 + 1][arg7] - Static123.anInt3947;
		@Pc(63) int local63 = SceneGraph.tileHeights[arg1][arg6 + 1][arg7 + 1] - Static123.anInt3947;
		@Pc(75) int local75 = SceneGraph.tileHeights[arg1][arg6][arg7 + 1] - Static123.anInt3947;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
		@Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
		@Pc(119) int local119 = local107;
		if (local117 < 50) {
			return;
		}
		local85 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local85;
		local85 = local49 * arg3 - local143 * arg2 >> 16;
		@Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
		local49 = local85;
		if (local165 < 50) {
			return;
		}
		local85 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(193) int local193 = local85;
		local85 = local63 * arg3 - local27 * arg2 >> 16;
		local27 = local63 * arg2 + local27 * arg3 >> 16;
		local63 = local85;
		if (local27 < 50) {
			return;
		}
		local85 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(241) int local241 = local85;
		local85 = local75 * arg3 - local239 * arg2 >> 16;
		@Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
		if (local261 < 50) {
			return;
		}
		@Pc(275) int local275 = Rasteriser.centerX + (local97 << 9) / local117;
		@Pc(283) int local283 = Rasteriser.centerY + (local119 << 9) / local117;
		@Pc(291) int local291 = Rasteriser.centerX + (local21 << 9) / local165;
		@Pc(299) int local299 = Rasteriser.centerY + (local49 << 9) / local165;
		@Pc(307) int local307 = Rasteriser.centerX + (local193 << 9) / local27;
		@Pc(315) int local315 = Rasteriser.centerY + (local63 << 9) / local27;
		@Pc(323) int local323 = Rasteriser.centerX + (local241 << 9) / local261;
		@Pc(331) int local331 = Rasteriser.centerY + (local85 << 9) / local261;
		Rasteriser.alpha = 0;
		@Pc(475) int local475;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static158.aBoolean187 && Static19.method583(Static89.anInt2388 + Rasteriser.centerX, Static131.anInt3259 + Rasteriser.centerY, local315, local331, local299, local307, local323, local291)) {
				Static56.anInt1742 = arg6;
				Static116.anInt2954 = arg7;
			}
			if (!GlRenderer.enabled && !arg8) {
				Rasteriser.testX = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Rasteriser.width || local323 > Rasteriser.width || local291 > Rasteriser.width) {
					Rasteriser.testX = true;
				}
				if (arg0.anInt4869 == -1) {
					if (arg0.anInt4865 != 12345678) {
						Rasteriser.fillGouraudTriangle(local315, local331, local299, local307, local323, local291, arg0.anInt4865, arg0.anInt4864, arg0.anInt4867);
					}
				} else if (!Preferences.manyGroundTextures) {
					local475 = Rasteriser.textureProvider.getAverageColor(arg0.anInt4869);
					Rasteriser.fillGouraudTriangle(local315, local331, local299, local307, local323, local291, Static216.method1640(local475, arg0.anInt4865), Static216.method1640(local475, arg0.anInt4864), Static216.method1640(local475, arg0.anInt4867));
				} else if (arg0.aBoolean241) {
					Rasteriser.fillTexturedTriangle(local315, local331, local299, local307, local323, local291, arg0.anInt4865, arg0.anInt4864, arg0.anInt4867, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4869);
				} else {
					Rasteriser.fillTexturedTriangle(local315, local331, local299, local307, local323, local291, arg0.anInt4865, arg0.anInt4864, arg0.anInt4867, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt4869);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static158.aBoolean187 && Static19.method583(Static89.anInt2388 + Rasteriser.centerX, Static131.anInt3259 + Rasteriser.centerY, local283, local299, local331, local275, local291, local323)) {
			Static56.anInt1742 = arg6;
			Static116.anInt2954 = arg7;
		}
		if (GlRenderer.enabled || arg8) {
			return;
		}
		Rasteriser.testX = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Rasteriser.width || local291 > Rasteriser.width || local323 > Rasteriser.width) {
			Rasteriser.testX = true;
		}
		if (arg0.anInt4869 == -1) {
			if (arg0.anInt4872 != 12345678) {
				Rasteriser.fillGouraudTriangle(local283, local299, local331, local275, local291, local323, arg0.anInt4872, arg0.anInt4867, arg0.anInt4864);
			}
		} else if (Preferences.manyGroundTextures) {
			Rasteriser.fillTexturedTriangle(local283, local299, local331, local275, local291, local323, arg0.anInt4872, arg0.anInt4867, arg0.anInt4864, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt4869);
		} else {
			local475 = Rasteriser.textureProvider.getAverageColor(arg0.anInt4869);
			Rasteriser.fillGouraudTriangle(local283, local299, local331, local275, local291, local323, Static216.method1640(local475, arg0.anInt4872), Static216.method1640(local475, arg0.anInt4867), Static216.method1640(local475, arg0.anInt4864));
		}
	}
}
