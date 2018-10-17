package de.abas.dpd.sales.packingslip;

import de.abas.erp.axi.event.EventException;
import de.abas.erp.axi.screen.ScreenControl;
import de.abas.erp.axi2.EventHandlerRunner;
import de.abas.erp.axi2.annotation.ButtonEventHandler;
import de.abas.erp.axi2.annotation.EventHandler;
import de.abas.erp.axi2.annotation.ScreenEventHandler;
import de.abas.erp.axi2.event.ButtonEvent;
import de.abas.erp.axi2.event.ScreenEvent;
import de.abas.erp.axi2.type.ButtonEventType;
import de.abas.erp.axi2.type.ScreenEventType;
import de.abas.erp.common.type.IdImpl;
import de.abas.erp.db.DbContext;
import de.abas.erp.db.schema.company.CompanyData;
import de.abas.erp.db.schema.sales.PackingSlipEditor;
import de.abas.erp.jfop.rt.api.annotation.RunFopWith;

@EventHandler(head = PackingSlipEditor.class)

@RunFopWith(EventHandlerRunner.class)

public class PackingSlipEventHandler {

	@ButtonEventHandler(field = "ypadpdgetlabel", type = ButtonEventType.BEFORE)
	public void ypadpdgetlabelBefore(ButtonEvent event, ScreenControl screenControl, DbContext ctx,
			PackingSlipEditor head) throws EventException {
		// copyData in DPD-Fields
		head.setYpadpdcustref1(head.getIdno());

		readSenderData(ctx, head);

		readRecipientData(head);

		readProductData(head);

	}

	private void readRecipientData(PackingSlipEditor head) {
		if (!head.getAddr2().isEmpty()) {
			String name1 = head.getAddr2().substring(0, head.getAddr2().indexOf(";"));
			String name2 = head.getAddr2().substring(head.getAddr2().indexOf(";"), head.getAddr2().length());

			head.setYpadpdreciname1(name1);
			head.setYpadpdreciname2(name2);
			head.setYpadpdrecistreet(head.getStreet2());
			// head.setYpadpdrecihouseno(value);
			head.setYpadpdrecizipcode(head.getZipCode2());
			head.setYpadpdrecicity(head.getTown2());
			head.setYpadpdrecistate(head.getRegion2());

		} else {
			String name1 = head.getAddr().substring(0, head.getAddr().indexOf(";"));
			String name2 = head.getAddr().substring(head.getAddr().indexOf(";"), head.getAddr().length());

			head.setYpadpdreciname1(name1);
			head.setYpadpdreciname2(name2);
			head.setYpadpdrecistreet(head.getStreet());
			// head.setYpadpdrecihouseno(value);
			head.setYpadpdrecizipcode(head.getZipCode());
			head.setYpadpdrecicity(head.getTown());
			head.setYpadpdrecicity(head.getTown());
			head.setYpadpdrecistate(head.getRegion());
		}
	}

	private void readSenderData(DbContext ctx, PackingSlipEditor head) {
		CompanyData comp = ctx.load(CompanyData.class, new IdImpl("$,,nummer=1"));

		if (comp != null) {
			String name1 = comp.getAddr().substring(0, comp.getAddr().indexOf(";"));
			String name2 = comp.getAddr().substring(comp.getAddr().indexOf(";"), comp.getAddr().length());
			head.setYpadpdsendname1(name1);
			head.setYpadpdsendname2(name2);
			head.setYpadpdsendstreet(comp.getStreet());
			// head.setYpadpdsendhouseno();
			head.setYpadpdsendzipcode(comp.getZipCode());
			head.setYpadpdsendcity(comp.getTown());
			head.setYpadpdsendcountry(comp.getStateOfTaxOffice());
			head.setYpadpdsendstate(comp.getRegion());
		}
	}

	@ButtonEventHandler(field = "ypadpdgetlabel", type = ButtonEventType.AFTER)
	public void ypadpdgetlabelAfter(ButtonEvent event, ScreenControl screenControl, DbContext ctx,
			PackingSlipEditor head) throws EventException {
		// create dpdData
	}

	@ScreenEventHandler(type = ScreenEventType.ENTER)
	public void screenEnter(ScreenEvent event, ScreenControl screenControl, DbContext ctx, PackingSlipEditor head)
			throws EventException {
		// TODO Auto-generated method stub
	}

}
