package cn.charlotte.pit.parm.listener;

import com.google.common.util.concurrent.AtomicDouble;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @Author: EmptyIrony
 * @Date: 2021/1/2 0:06
 */
public interface IPlayerShootEntity {

    /**
     * @param enchantLevel 物品附魔等级
     * @param attacker     攻击者（物品持有者）
     * @param target       目标玩家对象
     * @param damage       物品初始伤害（未经过护甲处理）
     * @param finalDamage  最终伤害，即target受到的最终伤害
     * @param boostDamage  伤害倍率，将在所有附魔结算后统一计算，基础值为1
     * @param cancel       取消事件
     */
    void handleShootEntity(int enchantLevel, Player attacker, Entity target, double damage, AtomicDouble finalDamage, AtomicDouble boostDamage, AtomicBoolean cancel);
}
