package rs.readahead.washington.mobile.domain.repository.reports

import com.hzontal.tella_vault.VaultFile
import io.reactivex.Flowable
import io.reactivex.Single
import rs.readahead.washington.mobile.data.entity.reports.ReportBodyEntity
import rs.readahead.washington.mobile.domain.entity.UploadProgressInfo
import rs.readahead.washington.mobile.domain.entity.reports.ReportPostResult
import rs.readahead.washington.mobile.domain.entity.reports.TellaReportServer

interface ReportsRepository {
    fun login(server: TellaReportServer, slug: String): Single<TellaReportServer>

    fun submitReport(
        server: TellaReportServer,
        reportBody: ReportBodyEntity
    ): Single<ReportPostResult>

    fun upload(
        vaultFile: VaultFile,
        urlServer: String,
        reportId: String,
        accessToken: String
    ): Flowable<UploadProgressInfo>

    fun check(
        vaultFile: VaultFile,
        urlServer: String,
        reportId: String,
        accessToken: String
    ): Single<UploadProgressInfo>
}