package nl.tudelft.coccreator.model.entities;

import lombok.Getter;
import lombok.Setter;

public class PlayerTrigger extends Entity {
	@Getter @Setter private float triggerDistance;
	@Getter @Setter private float cooldown;
	@Getter @Setter private String file;

	public PlayerTrigger(int xCoord, int yCoord, int zCoord, float triggerDistance, float cooldown, String file) {
		super(xCoord, yCoord, zCoord, "PlayerTrigger");
		this.triggerDistance = triggerDistance;
		this.cooldown = cooldown;
		if (file.endsWith(".class")) {
			this.file = file;
		} else {
			this.file = file + ".class";
		}
	}

	@Override
	public String toString() {
		return super.toString() + " " + triggerDistance + " " + cooldown + " " + file;
	}

	@Override
	public String getColour() {
		return "551A8B";
	}
}
