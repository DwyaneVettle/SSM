// pages/person/person.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    id: undefined,
    name: '',
    job: ''
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this;
    this.setData({
      id: options.id
    })
    if (options.id == undefined) {
      return;
    }

    wx.request({
      url: 'http://127.0.0.1/base/person/get',
      data: {'id': options.id},
      method: 'GET',
      success: function(rs) {
        var toastText = '获取数据失败, 原因:' + rs.data.message;
        if (rs.data.status == 200) {
          var result = rs.data.data;
          if (result == null) {
            toastText = "无数据";
            wx.showToast({
              title: toastText,
              icon: '',
              duration: 2000
            })            
          } else {
            that.setData({
              name: result.name,
              job: result.job
            }) 
          }
        } else {
          wx.showToast({
            title: toastText,
            icon: '',
            duration: 2000
          })           
        }
      }
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },

  formSubmit: function(obj) {
    var that = this;

    var formData = obj.detail.value;
    if (that.data.id != undefined) {
      formData.id = that.data.id;
    }

    wx.request({
      url: 'http://127.0.0.1/base/person/save',
      data: JSON.stringify(formData),
      method: 'POST',
      header: {
        'Content-Type': 'application/json'
      },
      success: function(rs) {
        var toastText = "操作成功";
        if (rs.data.status != 200) {
          toastText = '操作失败';
        }
        wx.showToast({
          title: toastText,
          icon: '',
          duration: 2000
        })    

        if (that.data.id == undefined) {
          wx.redirectTo({
            url: '../list/list'
          })
        }
      }
    })
  }

})