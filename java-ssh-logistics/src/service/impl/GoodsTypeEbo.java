package service.impl;

import java.io.Serializable;
import java.util.List;

import dao.GoodsTypeDao;
import model.BaseQueryModel;
import model.GoodsTypeModel;
import service.GoodsTypeEbi;

public class GoodsTypeEbo implements GoodsTypeEbi{
	private GoodsTypeDao goodsTypeDao;
	public void setGoodsTypeDao(GoodsTypeDao goodsTypeDao) {
		this.goodsTypeDao = goodsTypeDao;
	}

	public void save(GoodsTypeModel gm) {
		goodsTypeDao.save(gm);
	}

	public void update(GoodsTypeModel gm) {
		goodsTypeDao.update(gm);
	}

	public void delete(GoodsTypeModel gm) {
		goodsTypeDao.delete(gm);
	}

	public GoodsTypeModel get(Serializable uuid) {
		return goodsTypeDao.get(uuid);
	}

	public List<GoodsTypeModel> getAll() {
		return goodsTypeDao.getAll();
	}

	public List<GoodsTypeModel> getAll(BaseQueryModel qm, Integer pageNum,Integer pageCount) {
		return goodsTypeDao.getAll(qm,pageNum,pageCount);
	}

	public Integer getCount(BaseQueryModel qm) {
		return goodsTypeDao.getCount(qm);
	}

	public List<GoodsTypeModel> getAllBySm(Long uuid) {
		return goodsTypeDao.getAllBySmUuid(uuid);
	}

	public List<GoodsTypeModel> getAllUnionBySm(Long uuid) {
		return goodsTypeDao.getAllUnionBySmUuid(uuid);
	}

}
