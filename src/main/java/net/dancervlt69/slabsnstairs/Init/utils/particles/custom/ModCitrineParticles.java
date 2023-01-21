package net.dancervlt69.slabsnstairs.init.utils.particles.custom;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

public class ModCitrineParticle extends TextureSheetParticle {
    private final double pXSpeed;
    private final double pYSpeed;
    private final double pZSpeed;

    protected ModCitrineParticle(ClientLevel pLevel, double pX, double pY, double pZ, SpriteSet spriteSet,
                                 double pXSpeed, double pYSpeed, double pZSpeed) {
        super(pLevel, pX, pY, pZ, pXSpeed, pYSpeed, pZSpeed);

        this.friction = 0.8F;
        this.pXSpeed = pXSpeed;
        this.pYSpeed = pYSpeed;
        this.pZSpeed = pZSpeed;
        this.quadSize *= 0.85F;
        this.lifetime = 30;
        this.setSpriteFromAge(spriteSet);

        this.rCol = 1F;
        this.gCol = 1F;
        this.bCol = 1F;
    }

    @OnlyIn(Dist.CLIENT)
    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public Provider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        public Particle createParticle(SimpleParticleType particleType, ClientLevel pLevel, double x, double y,
                                       double z, double xSpeed, double ySpeed, double zSpeed) {
            return new ModCitrineParticle(pLevel, x, y, z, this.spriteSet, xSpeed, ySpeed, zSpeed);
        }
    }

    @Override
    public void tick() { super.tick(); fadeOut(); }

    private void fadeOut() { this.alpha = (-(1/(float)lifetime) * age + 1); }

    @NotNull
    @Override
    public ParticleRenderType getRenderType() { return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT; }
}
