package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "Lclient!na;")
	public static final JagString aClass100_133 = JagString.parse("(U1");

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBIIII)V")
	public static void method645(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3;
		@Pc(10) int local10;
		for (local3 = arg1; local3 <= arg3 + arg1; local3++) {
			for (local10 = arg2; local10 <= arg4 + arg2; local10++) {
				if (local10 >= 0 && local10 < 104 && local3 >= 0 && local3 < 104) {
					Static118.aByteArrayArrayArray9[arg0][local10][local3] = 127;
				}
			}
		}
		for (local3 = arg1; local3 < arg3 + arg1; local3++) {
			for (local10 = arg2; local10 < arg2 + arg4; local10++) {
				if (local10 >= 0 && local10 < 104 && local3 >= 0 && local3 < 104) {
					SceneGraph.tileHeights[arg0][local10][local3] = arg0 <= 0 ? 0 : SceneGraph.tileHeights[arg0 - 1][local10][local3];
				}
			}
		}
		if (arg2 > 0 && arg2 < 104) {
			for (local3 = arg1 + 1; local3 < arg1 + arg3; local3++) {
				if (local3 >= 0 && local3 < 104) {
					SceneGraph.tileHeights[arg0][arg2][local3] = SceneGraph.tileHeights[arg0][arg2 - 1][local3];
				}
			}
		}
		if (arg1 > 0 && arg1 < 104) {
			for (local3 = arg2 + 1; local3 < arg2 + arg4; local3++) {
				if (local3 >= 0 && local3 < 104) {
					SceneGraph.tileHeights[arg0][local3][arg1] = SceneGraph.tileHeights[arg0][local3][arg1 - 1];
				}
			}
		}
		if (arg2 < 0 || arg1 < 0 || arg2 >= 104 || arg1 >= 104) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 > 0 && SceneGraph.tileHeights[arg0][arg2 - 1][arg1] != 0) {
				SceneGraph.tileHeights[arg0][arg2][arg1] = SceneGraph.tileHeights[arg0][arg2 - 1][arg1];
			} else if (arg1 > 0 && SceneGraph.tileHeights[arg0][arg2][arg1 - 1] != 0) {
				SceneGraph.tileHeights[arg0][arg2][arg1] = SceneGraph.tileHeights[arg0][arg2][arg1 - 1];
			} else if (arg2 > 0 && arg1 > 0 && SceneGraph.tileHeights[arg0][arg2 - 1][arg1 - 1] != 0) {
				SceneGraph.tileHeights[arg0][arg2][arg1] = SceneGraph.tileHeights[arg0][arg2 - 1][arg1 - 1];
			}
		} else if (arg2 > 0 && SceneGraph.tileHeights[arg0 - 1][arg2 - 1][arg1] != SceneGraph.tileHeights[arg0][arg2 - 1][arg1]) {
			SceneGraph.tileHeights[arg0][arg2][arg1] = SceneGraph.tileHeights[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && SceneGraph.tileHeights[arg0][arg2][arg1 - 1] != SceneGraph.tileHeights[arg0 - 1][arg2][arg1 - 1]) {
			SceneGraph.tileHeights[arg0][arg2][arg1] = SceneGraph.tileHeights[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && SceneGraph.tileHeights[arg0][arg2 - 1][arg1 - 1] != SceneGraph.tileHeights[arg0 - 1][arg2 - 1][arg1 - 1]) {
			SceneGraph.tileHeights[arg0][arg2][arg1] = SceneGraph.tileHeights[arg0][arg2 - 1][arg1 - 1];
		}
	}

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B[B)[B")
	public static byte[] method648(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		JagString.copy(arg0, 0, local9, 0, local6);
		return local9;
	}
}
